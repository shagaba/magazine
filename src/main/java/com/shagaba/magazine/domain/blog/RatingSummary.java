package com.shagaba.magazine.domain.blog;

import java.util.List;

public class RatingSummary {

    protected List<String> likedByUsers;
    
    protected List<String> dislikedByUsers;

    /**
     * @return the likedByUsers
     */
    public List<String> getLikedByUsers() {
        return likedByUsers;
    }

    /**
     * @param likedByUsers the likedByUsers to set
     */
    public void setLikedByUsers(List<String> likedByUsers) {
        this.likedByUsers = likedByUsers;
    }

    /**
     * @return the dislikedByUsers
     */
    public List<String> getDislikedByUsers() {
        return dislikedByUsers;
    }

    /**
     * @param dislikedByUsers the dislikedByUsers to set
     */
    public void setDislikedByUsers(List<String> dislikedByUsers) {
        this.dislikedByUsers = dislikedByUsers;
    }

}
