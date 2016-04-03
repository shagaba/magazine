package com.shagaba.magazine;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Collection;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.core.env.SimpleCommandLinePropertySource;

import com.google.common.collect.Lists;
import com.shagaba.magazine.config.SpringProfile;

@SpringBootApplication
public class BootApplication {
	private static final Logger logger = LoggerFactory.getLogger(BootApplication.class);
	
	@Autowired
	private Environment environment; 

    /**
     * Initializes Magazine.
     * <p>
     * Spring profiles can be configured with a program arguments --spring.profiles.active=your-active-profile
     * <p>
     */
    @PostConstruct
    public void initApplication() {
        if (environment.getActiveProfiles().length == 0) {
        	logger.warn("No Spring profile configured, running with default configuration");
        } else {
        	logger.info("Running with Spring profile(s) : {}", Arrays.toString(environment.getActiveProfiles()));
            Collection<String> activeProfiles = Lists.newArrayList(environment.getActiveProfiles());
            if (activeProfiles.contains(SpringProfile.DEVELOPMENT) && activeProfiles.contains(SpringProfile.PRODUCTION)) {
            	logger.error("You have misconfigured your application! " +
                    "It should not run with both the 'dev' and 'prod' profiles at the same time.");
            }
            if (activeProfiles.contains(SpringProfile.DEVELOPMENT) && activeProfiles.contains(SpringProfile.CLOUD)) {
            	logger.error("You have misconfigured your application! " +
                    "It should not run with both the 'dev' and 'cloud' profiles at the same time.");
            }
        }
    }

    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments
     * @throws UnknownHostException if the local host name could not be resolved into an address
     */
    public static void main(String[] args) throws UnknownHostException {
        SpringApplication springApplication = new SpringApplication(BootApplication.class);
        SimpleCommandLinePropertySource source = new SimpleCommandLinePropertySource(args);
        addDefaultProfile(springApplication, source);
        Environment environment = springApplication.run(args).getEnvironment();
        logger.info("\n----------------------------------------------------------\n" +
                "\tApplication '{}' is running! Access URLs:\n" +
                "\tLocal: \t\thttp://127.0.0.1:{}\n" +
                "\tExternal: \thttp://{}:{}\n" +
                "\tActive Profiles: {}\n" + 
                "----------------------------------------------------------",
                environment.getProperty("spring.application.name"),
                environment.getProperty("server.port"),
                InetAddress.getLocalHost().getHostAddress(),
                environment.getProperty("server.port"),
                environment.getActiveProfiles() );
    }	
	/**
     * If no profile has been configured, set by default the "dev" profile.
     */
    private static void addDefaultProfile(SpringApplication springApplication, SimpleCommandLinePropertySource source) {
        if (!source.containsProperty("spring.profiles.active") &&
                !System.getenv().containsKey("SPRING_PROFILES_ACTIVE")) {

        	springApplication.setAdditionalProfiles(SpringProfile.DEVELOPMENT);
        }
    }
	
}
