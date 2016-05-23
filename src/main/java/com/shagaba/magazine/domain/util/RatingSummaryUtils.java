package com.shagaba.magazine.domain.util;

import java.util.List;

import com.google.common.collect.Lists;
import com.shagaba.magazine.domain.blog.RatingSummary;

public final class RatingSummaryUtils {

	private RatingSummaryUtils() {
	}
	
	/**
	 * 	
	 * @param ratingSummary
	 * @param likedUser
	 * @return
	 */
	public static RatingSummary addLikedUser(RatingSummary ratingSummary, String likedUser) {
		RatingSummary ratingSummaryResult = ratingSummary;
		if (ratingSummaryResult == null) {
			ratingSummaryResult = new RatingSummary();
		}
		List<String> likedByUsers = ratingSummaryResult.getLikedByUsers();
		if (likedByUsers == null) {
			likedByUsers = Lists.newArrayList();
			ratingSummaryResult.setLikedByUsers(likedByUsers);
		}
		if (!likedByUsers.contains(likedUser)) {
			likedByUsers.add(likedUser);
		}
		return ratingSummaryResult;
	}
	
	/**
	 * 	
	 * @param ratingSummary
	 * @param likedUser
	 * @return
	 */
	public static RatingSummary removeLikedUser(RatingSummary ratingSummary, String likedUser) {
		if (ratingSummary == null 
				|| ratingSummary.getLikedByUsers() == null) {
			return ratingSummary;
		}
		ratingSummary.getLikedByUsers().remove(likedUser);
		
		if (ratingSummary.getLikedByUsers().isEmpty()) {
			ratingSummary.setLikedByUsers(null);
		}
		if (ratingSummary.getLikedByUsers() == null
				&& ratingSummary.getDislikedByUsers() == null) {
			return null;
		}
		return ratingSummary;
	}
	
	/**
	 * 	
	 * @param ratingSummary
	 * @param dislikedUser
	 * @return
	 */
	public static RatingSummary addDislikedUser(RatingSummary ratingSummary, String dislikedUser) {
		RatingSummary ratingSummaryResult = ratingSummary;
		if (ratingSummaryResult == null) {
			ratingSummaryResult = new RatingSummary();
		}
		List<String> dislikedByUsers = ratingSummaryResult.getDislikedByUsers();
		if (dislikedByUsers == null) {
			dislikedByUsers = Lists.newArrayList();
			ratingSummaryResult.setDislikedByUsers(dislikedByUsers);
		}
		if (!dislikedByUsers.contains(dislikedUser)) {
			dislikedByUsers.add(dislikedUser);
		}
		return ratingSummaryResult;
	}

	/**
	 * 	
	 * @param ratingSummary
	 * @param dislikedUser
	 * @return
	 */
	public static RatingSummary removeDislikedUser(RatingSummary ratingSummary, String dislikedUser) {
		if (ratingSummary == null 
				|| ratingSummary.getDislikedByUsers() == null) {
			return ratingSummary;
		}
		ratingSummary.getDislikedByUsers().remove(dislikedUser);
		
		if (ratingSummary.getDislikedByUsers().isEmpty()) {
			ratingSummary.setDislikedByUsers(null);
		}
		if (ratingSummary.getDislikedByUsers() == null
				&& ratingSummary.getLikedByUsers() == null) {
			return null;
		}
		return ratingSummary;
	}
	
}
