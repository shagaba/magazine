package com.shagaba.magazine.domain.blog;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shagaba.magazine.domain.AccountIdentifiable;
import com.shagaba.magazine.domain.Identifiable;
import com.shagaba.magazine.domain.audit.AuditingDomain;

@Document
public class Blog extends AuditingDomain implements Identifiable<String>, AccountIdentifiable<String> {

    @Id
    protected String id;

    protected String accountId;

    protected Post frontPost;

    protected RatingSummary ratingSummary;
    
    protected Settings settings;

	/**
	 * @return the id
	 */
    @Override
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
    @Override
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the accountId
	 */
    @Override
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
    @Override
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the frontPost
	 */
	public Post getFrontPost() {
		return frontPost;
	}

	/**
	 * @param frontPost the frontPost to set
	 */
	public void setFrontPost(Post frontPost) {
		this.frontPost = frontPost;
	}

	/**
	 * @return the ratingSummary
	 */
	public RatingSummary getRatingSummary() {
		return ratingSummary;
	}

	/**
	 * @param ratingSummary the ratingSummary to set
	 */
	public void setRatingSummary(RatingSummary ratingSummary) {
		this.ratingSummary = ratingSummary;
	}

	/**
	 * @return the settings
	 */
	public Settings getSettings() {
		return settings;
	}

	/**
	 * @param settings the settings to set
	 */
	public void setSettings(Settings settings) {
		this.settings = settings;
	}
    
}
