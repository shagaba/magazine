package com.shagaba.magazine.security.domain;

import java.util.Date;

public class Attempt {

	protected String ip;

	protected Date timestamp;

	protected AttemptStatus attemptStatus;

	/**
	 * 
	 */
	public Attempt() {
		super();
	}

	/**
	 * @param ip
	 * @param timestamp
	 * @param attemptStatus
	 */
	public Attempt(String ip, Date timestamp, AttemptStatus attemptStatus) {
		super();
		this.ip = ip;
		this.timestamp = timestamp;
		this.attemptStatus = attemptStatus;
	}

	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * @param ip
	 *            the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the attemptStatus
	 */
	public AttemptStatus getAuthenticationAttemptStatus() {
		return attemptStatus;
	}

	/**
	 * @param attemptStatus
	 *            the attemptStatus to set
	 */
	public void setAuthenticationAttemptStatus(AttemptStatus attemptStatus) {
		this.attemptStatus = attemptStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Attempt {ip=%s, timestamp=%s, attemptStatus=%s}", ip, timestamp, attemptStatus);
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
		result = prime * result + ((attemptStatus == null) ? 0 : attemptStatus.hashCode());
		result = prime * result + ((ip == null) ? 0 : ip.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
		Attempt other = (Attempt) obj;
		if (attemptStatus != other.attemptStatus)
			return false;
		if (ip == null) {
			if (other.ip != null)
				return false;
		} else if (!ip.equals(other.ip))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

}