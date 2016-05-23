package com.shagaba.magazine.security.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shagaba.magazine.domain.AccountIdentifiable;
import com.shagaba.magazine.domain.audit.AuditingDomain;

@Document
public class AuthenticationStatus extends AuditingDomain implements AccountIdentifiable<String> {

	@Id
	protected String accountId;

	protected boolean isActivated = false;

	protected boolean isEmailVerified = false;

	protected AuthenticationTraking loginAuthTraking;

	protected AuthenticationTraking tokenAuthTraking;

	protected ChallengeQuestionTraking challengeQuestionTraking;

	protected Date lockoutExperation;

	protected LockoutType lockoutType = null;

	protected PasswordStatus passwordStatus;

	/**
	 * 
	 */
	public AuthenticationStatus() {
		super();
	}

	/**
	 * @param id
	 * @param isActivated
	 * @param isEmailVerified
	 */
	public AuthenticationStatus(String accountId, boolean isActivated, boolean isEmailVerified) {
		super();
		this.accountId = accountId;
		this.isActivated = isActivated;
		this.isEmailVerified = isEmailVerified;
	}

	/**
	 * @param accountId
	 * @param isActivated
	 * @param isEmailVerified
	 * @param loginAuthTraking
	 * @param tokenAuthTraking
	 * @param challengeQuestionTraking
	 * @param lockoutExperation
	 * @param lockoutType
	 * @param passwordStatus
	 */
	public AuthenticationStatus(String accountId, boolean isActivated, boolean isEmailVerified,
			AuthenticationTraking loginAuthTraking, AuthenticationTraking tokenAuthTraking,
			ChallengeQuestionTraking challengeQuestionTraking, Date lockoutExperation, LockoutType lockoutType,
			PasswordStatus passwordStatus) {
		this.accountId = accountId;
		this.isActivated = isActivated;
		this.isEmailVerified = isEmailVerified;
		this.loginAuthTraking = loginAuthTraking;
		this.tokenAuthTraking = tokenAuthTraking;
		this.challengeQuestionTraking = challengeQuestionTraking;
		this.lockoutExperation = lockoutExperation;
		this.lockoutType = lockoutType;
		this.passwordStatus = passwordStatus;
	}

	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId
	 *            the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the isActivated
	 */
	public boolean isActivated() {
		return isActivated;
	}

	/**
	 * @param isActivated
	 *            the isActivated to set
	 */
	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	/**
	 * @return the isEmailVerified
	 */
	public boolean isEmailVerified() {
		return isEmailVerified;
	}

	/**
	 * @param isEmailVerified
	 *            the isEmailVerified to set
	 */
	public void setEmailVerified(boolean isEmailVerified) {
		this.isEmailVerified = isEmailVerified;
	}

	/**
	 * @return the loginAuthTraking
	 */
	public AuthenticationTraking getLoginAuthTraking() {
		return loginAuthTraking;
	}

	/**
	 * @param loginAuthTraking
	 *            the loginAuthTraking to set
	 */
	public void setLoginAuthTraking(AuthenticationTraking loginAuthTraking) {
		this.loginAuthTraking = loginAuthTraking;
	}

	/**
	 * @return the tokenAuthTraking
	 */
	public AuthenticationTraking getTokenAuthTraking() {
		return tokenAuthTraking;
	}

	/**
	 * @param tokenAuthTraking
	 *            the tokenAuthTraking to set
	 */
	public void setTokenAuthTraking(AuthenticationTraking tokenAuthTraking) {
		this.tokenAuthTraking = tokenAuthTraking;
	}

	/**
	 * @return the challengeQuestionTraking
	 */
	public ChallengeQuestionTraking getChallengeQuestionTraking() {
		return challengeQuestionTraking;
	}

	/**
	 * @param challengeQuestionTraking
	 *            the challengeQuestionTraking to set
	 */
	public void setChallengeQuestionTraking(ChallengeQuestionTraking challengeQuestionTraking) {
		this.challengeQuestionTraking = challengeQuestionTraking;
	}

	/**
	 * @return the lockoutExperation
	 */
	public Date getLockoutExperation() {
		return lockoutExperation;
	}

	/**
	 * @param lockoutExperation
	 *            the lockoutExperation to set
	 */
	public void setLockoutExperation(Date lockoutExperation) {
		this.lockoutExperation = lockoutExperation;
	}

	/**
	 * @return the lockoutType
	 */
	public LockoutType getLockoutType() {
		return lockoutType;
	}

	/**
	 * @param lockoutType
	 *            the lockoutType to set
	 */
	public void setLockoutType(LockoutType lockoutType) {
		this.lockoutType = lockoutType;
	}

	/**
	 * @return the passwordStatus
	 */
	public PasswordStatus getPasswordStatus() {
		return passwordStatus;
	}

	/**
	 * @param passwordStatus
	 *            the passwordStatus to set
	 */
	public void setPasswordStatus(PasswordStatus passwordStatus) {
		this.passwordStatus = passwordStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"AuthenticationStatus {accountId=%s, isActivated=%s, isEmailVerified=%s, loginAuthTraking=%s, tokenAuthTraking=%s, challengeQuestionTraking=%s, lockoutExperation=%s, lockoutType=%s, passwordStatus=%s}",
				accountId, isActivated, isEmailVerified, loginAuthTraking, tokenAuthTraking, challengeQuestionTraking,
				lockoutExperation, lockoutType, passwordStatus);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((challengeQuestionTraking == null) ? 0 : challengeQuestionTraking.hashCode());
		result = prime * result + (isEmailVerified ? 1231 : 1237);
		result = prime * result + (isActivated ? 1231 : 1237);
		result = prime * result + ((lockoutExperation == null) ? 0 : lockoutExperation.hashCode());
		result = prime * result + ((lockoutType == null) ? 0 : lockoutType.hashCode());
		result = prime * result + ((loginAuthTraking == null) ? 0 : loginAuthTraking.hashCode());
		result = prime * result + ((passwordStatus == null) ? 0 : passwordStatus.hashCode());
		result = prime * result + ((tokenAuthTraking == null) ? 0 : tokenAuthTraking.hashCode());
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
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AuthenticationStatus other = (AuthenticationStatus) obj;
		if (accountId == null) {
			if (other.accountId != null)
				return false;
		} else if (!accountId.equals(other.accountId))
			return false;
		if (challengeQuestionTraking == null) {
			if (other.challengeQuestionTraking != null)
				return false;
		} else if (!challengeQuestionTraking.equals(other.challengeQuestionTraking))
			return false;
		if (isEmailVerified != other.isEmailVerified)
			return false;
		if (isActivated != other.isActivated)
			return false;
		if (lockoutExperation == null) {
			if (other.lockoutExperation != null)
				return false;
		} else if (!lockoutExperation.equals(other.lockoutExperation))
			return false;
		if (lockoutType != other.lockoutType)
			return false;
		if (loginAuthTraking == null) {
			if (other.loginAuthTraking != null)
				return false;
		} else if (!loginAuthTraking.equals(other.loginAuthTraking))
			return false;
		if (passwordStatus == null) {
			if (other.passwordStatus != null)
				return false;
		} else if (!passwordStatus.equals(other.passwordStatus))
			return false;
		if (tokenAuthTraking == null) {
			if (other.tokenAuthTraking != null)
				return false;
		} else if (!tokenAuthTraking.equals(other.tokenAuthTraking))
			return false;
		return true;
	}

}