package com.shagaba.magazine.domain.blog;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.shagaba.magazine.domain.AccountIdentifiable;
import com.shagaba.magazine.domain.Identifiable;
import com.shagaba.magazine.domain.audit.AuditingDomain;

@Document
public class BlogPost extends AuditingDomain implements Identifiable<String>, AccountIdentifiable<String> {

    @Id
    protected String id;

    protected String accountId;

    protected String blogId;

    protected PostStatus status;
    
    protected Post post;
    
    protected RatingSummary ratingSummary;

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
	 * @return the blogId
	 */
	public String getBlogId() {
		return blogId;
	}

	/**
	 * @param blogId the blogId to set
	 */
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}

	/**
	 * @return the status
	 */
	public PostStatus getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(PostStatus status) {
		this.status = status;
	}

	/**
	 * @return the post
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * @param post the post to set
	 */
	public void setPost(Post post) {
		this.post = post;
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

}
