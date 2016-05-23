package com.shagaba.magazine.security.domain;

import java.util.Date;

public class AccountEmailToken extends AccountToken {

	protected String emailAddress;

	/**
	 * 
	 */
	public AccountEmailToken() {
		super();
	}

	/**
	 * @param username
	 * @param emailAddress
	 * @param signature
	 * @param timestamp
	 */
	public AccountEmailToken(String username, String emailAddress, String signature, Date timestamp) {
		super(username, signature, timestamp);
		this.emailAddress = emailAddress;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("AccountToken {username=%s, emailAddress=%s, signature=%s, timestamp=%s}", username,
				emailAddress, signature, timestamp);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountEmailToken other = (AccountEmailToken) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		return true;
	}

}