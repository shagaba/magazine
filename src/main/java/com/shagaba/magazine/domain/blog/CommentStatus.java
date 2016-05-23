package com.shagaba.magazine.domain.blog;

public enum CommentStatus {
	/**
	 * publish: (default) Publish the comment. 
	 * private: Privately publish the comment.
	 * pending: Mark the comment as pending editorial approval. 
	 * spam: Mark the comment as spam and is not visible to readers of the post.
	 * removed: The comment has been removed from the post.
	 */

	PUBLISH, 
	PRIVATE, 
	PENDING, 
	SPAM,
	REMOVED
}
