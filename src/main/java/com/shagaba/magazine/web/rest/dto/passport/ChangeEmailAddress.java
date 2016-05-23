package com.shagaba.magazine.web.rest.dto.passport;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

import com.shagaba.magazine.security.annotation.CurrentEmailAddress;
import com.shagaba.magazine.security.annotation.UniqueEmailAddress;

public class ChangeEmailAddress {
	
	@NotNull
	@Email
	@CurrentEmailAddress
	protected String currentEmailAddress;

	@NotNull
	@Email
	@UniqueEmailAddress
	protected String newEmailAddress;

	/**
	 * @return the currentEmailAddress
	 */
	public String getCurrentEmailAddress() {
		return currentEmailAddress;
	}

	/**
	 * @param currentEmailAddress the currentEmailAddress to set
	 */
	public void setCurrentEmailAddress(String currentEmailAddress) {
		this.currentEmailAddress = currentEmailAddress;
	}

	/**
	 * @return the newEmailAddress
	 */
	public String getNewEmailAddress() {
		return newEmailAddress;
	}

	/**
	 * @param newEmailAddress the newEmailAddress to set
	 */
	public void setNewEmailAddress(String newEmailAddress) {
		this.newEmailAddress = newEmailAddress;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((currentEmailAddress == null) ? 0 : currentEmailAddress.hashCode());
		result = prime * result + ((newEmailAddress == null) ? 0 : newEmailAddress.hashCode());
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
		ChangeEmailAddress other = (ChangeEmailAddress) obj;
		if (currentEmailAddress == null) {
			if (other.currentEmailAddress != null)
				return false;
		} else if (!currentEmailAddress.equals(other.currentEmailAddress))
			return false;
		if (newEmailAddress == null) {
			if (other.newEmailAddress != null)
				return false;
		} else if (!newEmailAddress.equals(other.newEmailAddress))
			return false;
		return true;
	}
	
}