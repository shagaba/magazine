package com.shagaba.magazine.security.domain;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class RememberMeToken {

	@Id
	private String series;

	@Indexed
	private String username;

	private String tokenValue;

	private LocalDate tokenDate;
	
	private String ipAddress;

    private String userAgent;

	/**
	 * 
	 */
	public RememberMeToken() {
		super();
	}

	/**
	 * @param series
	 * @param username
	 * @param tokenValue
	 * @param tokenDate
	 * @param ipAddress
	 * @param userAgent
	 */
	public RememberMeToken(String series, String username, String tokenValue, LocalDate tokenDate, String ipAddress, String userAgent) {
		super();
		this.series = series;
		this.username = username;
		this.tokenValue = tokenValue;
		this.tokenDate = tokenDate;
		this.ipAddress = ipAddress;
		this.userAgent = userAgent;
	}

	/**
	 * @return the series
	 */
	public String getSeries() {
		return series;
	}

	/**
	 * @param series the series to set
	 */
	public void setSeries(String series) {
		this.series = series;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the tokenValue
	 */
	public String getTokenValue() {
		return tokenValue;
	}

	/**
	 * @param tokenValue the tokenValue to set
	 */
	public void setTokenValue(String tokenValue) {
		this.tokenValue = tokenValue;
	}

	/**
	 * @return the tokenDate
	 */
	public LocalDate getTokenDate() {
		return tokenDate;
	}

	/**
	 * @param tokenDate the tokenDate to set
	 */
	public void setTokenDate(LocalDate tokenDate) {
		this.tokenDate = tokenDate;
	}

	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}

	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	/**
	 * @return the userAgent
	 */
	public String getUserAgent() {
		return userAgent;
	}

	/**
	 * @param userAgent the userAgent to set
	 */
	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

}
