package com.shagaba.magazine.web.rest.dto.passport;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

import com.shagaba.magazine.security.annotation.CurrentEmailAddress;
import com.shagaba.magazine.security.annotation.UniqueUsername;

public class ChangeUsername {
	
	@NotNull
	@Email
	@CurrentEmailAddress
	protected String emailAddress;

	@NotNull
	@Size(min = 5, max = 30)
	@UniqueUsername
	protected String newUsername;

	/**
	 * @return the newUsername
	 */
	public String getNewUsername() {
		return newUsername;
	}

	/**
	 * @param newUsername the newUsername to set
	 */
	public void setNewUsername(String newUsername) {
		this.newUsername = newUsername;
	}

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((newUsername == null) ? 0 : newUsername.hashCode());
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
		ChangeUsername other = (ChangeUsername) obj;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (newUsername == null) {
			if (other.newUsername != null)
				return false;
		} else if (!newUsername.equals(other.newUsername))
			return false;
		return true;
	}

}