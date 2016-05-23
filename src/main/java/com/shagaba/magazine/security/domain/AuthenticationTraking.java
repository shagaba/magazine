package com.shagaba.magazine.security.domain;

import java.util.List;

public class AuthenticationTraking {

    protected int failCount = 0;

    protected List<Attempt> attempts;

    /**
     * @return the failCount
     */
    public int getFailCount() {
        return failCount;
    }

    /**
     * @param failCount the failCount to set
     */
    public void setFailCount(int failCount) {
        this.failCount = failCount;
    }

    /**
     * @return the attempts
     */
    public List<Attempt> getAuthenticationAttempts() {
        return attempts;
    }

    /**
     * @param attempts the attempts to set
     */
    public void setAuthenticationAttempts(List<Attempt> attempts) {
        this.attempts = attempts;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("AuthenticationTraking {failCount=%s, attempts=%s}", failCount, attempts);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((attempts == null) ? 0 : attempts.hashCode());
		result = prime * result + failCount;
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
		AuthenticationTraking other = (AuthenticationTraking) obj;
		if (attempts == null) {
			if (other.attempts != null)
				return false;
		} else if (!attempts.equals(other.attempts))
			return false;
		if (failCount != other.failCount)
			return false;
		return true;
	}

}