package com.shagaba.magazine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

import com.shagaba.magazine.config.SpringProfile;

public class ServletInitializer extends SpringBootServletInitializer {
	
	private final Logger logger = LoggerFactory.getLogger(ServletInitializer.class);

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.profiles(addDefaultProfile()).sources(BootApplication.class);
	}

	/**
     * Set a default profile if it has not been set.
     * <p>
     * Please use -Dspring.profiles.active=dev
     * </p>
     */
    private String addDefaultProfile() {
        String profile = System.getProperty("spring.profiles.active");
        if (profile != null) {
        	logger.info("Running with Spring profile(s) : {}", profile);
            return profile;
        }

        logger.warn("No Spring profile configured, running with default configuration");
        return SpringProfile.DEVELOPMENT;
    }
}
