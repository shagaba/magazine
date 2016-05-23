package com.shagaba.magazine.web.rest.dto.errors;

import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import org.springframework.http.HttpStatus;

public class ErrorDetail {

	protected Date timestamp;

	protected TimeZone timeZone;

	protected String errorCode;

	protected Integer statusValue;

	protected String statusReason;

	protected String method;

	protected String path;

	protected String message;

	protected List<ObjectErrorDetail> details;

	/**
	*
	*/
	public ErrorDetail() {
		this.timestamp = new Date();
		this.timeZone = TimeZone.getDefault();
	}

	/**
	 * @param httpStatus
	 * @param method
	 * @param path
	 */
	public ErrorDetail(HttpStatus httpStatus, String method, String path) {
		this();
		this.statusValue = httpStatus.value();
		this.statusReason = httpStatus.getReasonPhrase();
		this.method = method;
		this.path = path;
	}

	/**
	 *
	 * @param timestamp
	 * @param timeZone
	 */
	public ErrorDetail(Date timestamp, TimeZone timeZone) {
		this.timestamp = timestamp;
		this.timeZone = timeZone;
	}

	/**
	 * @param timestamp
	 * @param timeZone
	 * @param httpStatus
	 * @param method
	 * @param path
	 */
	public ErrorDetail(Date timestamp, TimeZone timeZone, HttpStatus httpStatus, String method, String path) {
		this(timestamp, timeZone);
		this.statusValue = httpStatus.value();
		this.statusReason = httpStatus.getReasonPhrase();
		this.method = method;
		this.path = path;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the timeZone
	 */
	public TimeZone getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timeZone the timeZone to set
	 */
	public void setTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	/**
	 * @return the statusValue
	 */
	public Integer getStatusValue() {
		return statusValue;
	}

	/**
	 * @param statusValue the statusValue to set
	 */
	public void setStatusValue(Integer statusValue) {
		this.statusValue = statusValue;
	}

	/**
	 * @return the statusReason
	 */
	public String getStatusReason() {
		return statusReason;
	}

	/**
	 * @param statusReason the statusReason to set
	 */
	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	/**
	 * @return the method
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * @param method the method to set
	 */
	public void setMethod(String method) {
		this.method = method;
	}

	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}

	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the details
	 */
	public List<ObjectErrorDetail> getDetails() {
		return details;
	}

	/**
	 * @param details the details to set
	 */
	public void setDetails(List<ObjectErrorDetail> details) {
		this.details = details;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(
				"ErrorDetail {timestamp=%s, timeZone=%s, errorCode=%s, statusValue=%s, statusReason=%s, method=%s, path=%s, message=%s, details=%s}",
				timestamp, timeZone, errorCode, statusValue, statusReason, method, path, message, details);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((errorCode == null) ? 0 : errorCode.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((method == null) ? 0 : method.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + ((statusReason == null) ? 0 : statusReason.hashCode());
		result = prime * result + ((statusValue == null) ? 0 : statusValue.hashCode());
		result = prime * result + ((timeZone == null) ? 0 : timeZone.hashCode());
		result = prime * result + ((timestamp == null) ? 0 : timestamp.hashCode());
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
		ErrorDetail other = (ErrorDetail) obj;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (errorCode == null) {
			if (other.errorCode != null)
				return false;
		} else if (!errorCode.equals(other.errorCode))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (method == null) {
			if (other.method != null)
				return false;
		} else if (!method.equals(other.method))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (statusReason == null) {
			if (other.statusReason != null)
				return false;
		} else if (!statusReason.equals(other.statusReason))
			return false;
		if (statusValue == null) {
			if (other.statusValue != null)
				return false;
		} else if (!statusValue.equals(other.statusValue))
			return false;
		if (timeZone == null) {
			if (other.timeZone != null)
				return false;
		} else if (!timeZone.equals(other.timeZone))
			return false;
		if (timestamp == null) {
			if (other.timestamp != null)
				return false;
		} else if (!timestamp.equals(other.timestamp))
			return false;
		return true;
	}

	
}
