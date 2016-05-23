package com.shagaba.magazine.web.rest.dto.blog;

public enum PostStatus {
	/**
	 * publish: (default) Publish the post. 
	 * private: Privately publish the post.
	 * draft: Save the post as a draft. 
	 * pending: Mark the post as pending editorial approval. 
	 * future: Schedule the post (alias for publish; you must also set a future date).
	 */

	PUBLISH, 
	PRIVATE, 
	DRAFT, 
	PENDING, 
	FUTURE
}
