package com.shagaba.magazine.security.domain;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shagaba.magazine.domain.AccountIdentifiable;
import com.shagaba.magazine.domain.audit.AuditingDomain;

@Document
public final class UserAccount extends AuditingDomain implements AccountIdentifiable<String> {

	@Id
	private String accountId;

	@NotNull
	@Size(min = 5, max = 50)
	@Indexed
	private String username;

    @NotNull
    @Size(min = 5, max = 60) 
	private String password;

    @NotNull
    @Email
    @Size(max = 100)
	@Indexed
	private String emailAddress;

	private List<ChallengeQuestion> challengeQuestions;

    @NotNull
	private String salt;

    @NotNull
	private List<UserAccountRole> roles;

    private String emailTokenSalt;

	/**
	 * 
	 */
	public UserAccount() {
		super();
	}

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param emailAddress
	 * @param challengeQuestions
	 * @param salt
	 * @param roles
	 */
	public UserAccount(String accountId, String username, String password, String emailAddress,
			List<ChallengeQuestion> challengeQuestions, String salt, List<UserAccountRole> roles) {
		super();
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.emailAddress = emailAddress;
		this.challengeQuestions = challengeQuestions;
		this.salt = salt;
		this.roles = roles;
		this.emailTokenSalt = null;
	}

	/**
	 * @return the id
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress
	 *            the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * @return the challengeQuestions
	 */
	public List<ChallengeQuestion> getChallengeQuestions() {
		return challengeQuestions;
	}

	/**
	 * @param challengeQuestions
	 *            the challengeQuestions to set
	 */
	public void setChallengeQuestions(List<ChallengeQuestion> challengeQuestions) {
		this.challengeQuestions = challengeQuestions;
	}

	/**
	 * @return the salt
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * @param salt
	 *            the salt to set
	 */
	public void setSalt(String salt) {
		this.salt = salt;
	}

	/**
	 * @return the roles
	 */
	public List<UserAccountRole> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 *            the roles to set
	 */
	public void setRoles(List<UserAccountRole> roles) {
		this.roles = roles;
	}
	
	
	/**
	 * @return the emailTokenSalt
	 */
	public String getEmailTokenSalt() {
		return emailTokenSalt;
	}

	/**
	 * @param emailTokenSalt the emailTokenSalt to set
	 */
	public void setEmailTokenSalt(String emailTokenSalt) {
		this.emailTokenSalt = emailTokenSalt;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"UserAccount {accountId=%s, username=%s, password=%s, emailAddress=%s, challengeQuestions=%s, salt=%s, roles=%s, emailTokenSalt=%s, version=%s, createdBy=%s, createdTime=%s, lastModifiedBy=%s, lastModifiedTime=%s}",
				accountId, username, "[PROTECTED]", emailAddress, challengeQuestions, "[PROTECTED]", roles, "[PROTECTED]",
				version, createdBy, createdTime, lastModifiedBy, lastModifiedTime);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserAccount other = (UserAccount) obj;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}


}