package com.shagaba.magazine.security.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChallengeQuestionTraking {

	protected int failCount = 0;

	protected Map<String, List<Attempt>> challengeQuestionAttemptMap = new HashMap<String, List<Attempt>>();

	/**
	 * @return the failCount
	 */
	public int getFailCount() {
		return failCount;
	}

	/**
	 * @param failCount
	 *            the failCount to set
	 */
	public void setFailCount(int failCount) {
		this.failCount = failCount;
	}

	/**
	 * @return the challengeQuestionAttemptMap
	 */
	public Map<String, List<Attempt>> getChallengeQuestionAttemptMap() {
		return challengeQuestionAttemptMap;
	}

	/**
	 * @param challengeQuestionAttemptMap
	 *            the challengeQuestionAttemptMap to set
	 */
	public void setChallengeQuestionAttemptMap(Map<String, List<Attempt>> challengeQuestionAttemptMap) {
		this.challengeQuestionAttemptMap = challengeQuestionAttemptMap;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("ChallengeQuestionTraking {failCount=%s, challengeQuestionAttemptMap=%s}", failCount,
				challengeQuestionAttemptMap);
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
		result = prime * result + ((challengeQuestionAttemptMap == null) ? 0 : challengeQuestionAttemptMap.hashCode());
		result = prime * result + failCount;
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
		ChallengeQuestionTraking other = (ChallengeQuestionTraking) obj;
		if (challengeQuestionAttemptMap == null) {
			if (other.challengeQuestionAttemptMap != null)
				return false;
		} else if (!challengeQuestionAttemptMap.equals(other.challengeQuestionAttemptMap))
			return false;
		if (failCount != other.failCount)
			return false;
		return true;
	}

}