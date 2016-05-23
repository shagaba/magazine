package com.shagaba.magazine.security.domain;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

/**
 * @author Shai
 *
 */
public class UserAccountDetails extends org.springframework.security.core.userdetails.User {

	private static final long serialVersionUID = 6439888840643653849L;
	protected String accountId;
	protected String emailAddress;
	protected String salt;

	/**
	 * @param accountId
	 * @param username
	 * @param password
	 * @param emailAddress
	 * @param salt
	 * @param authorities
	 */
	public UserAccountDetails(String accountId, String username, String password, String emailAddress, String salt, 
			Collection<? extends GrantedAuthority> authorities) {
		this(accountId, username, password, emailAddress, salt, true, true, true, true, authorities);
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param emailAddress
	 * @param salt
	 * @param enabled
	 * @param accountNonExpired
	 * @param credentialsNonExpired
	 * @param accountNonLocked
	 * @param authorities
	 */
	public UserAccountDetails(String accountId, String username, String password, String emailAddress, String salt,
			boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		this.accountId = accountId;
		this.emailAddress = emailAddress;
		this.salt = salt;
	}

	/**
	 * @return the id
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
}