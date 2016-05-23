package com.shagaba.magazine.domain.blog;

import java.time.LocalDateTime;
import java.util.List;

public class Post {

    protected String title;
    
    protected String subTitle;

    protected LocalDateTime publishedTime;
    
    protected List<Section> sections;
    
    protected List<String> categories;
    
    protected List<String> tags;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}

	/**
	 * @param subTitle the subTitle to set
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	/**
	 * @return the publishedTime
	 */
	public LocalDateTime getPublishedTime() {
		return publishedTime;
	}

	/**
	 * @param publishedTime the publishedTime to set
	 */
	public void setPublishedTime(LocalDateTime publishedTime) {
		this.publishedTime = publishedTime;
	}

	/**
	 * @return the sections
	 */
	public List<Section> getSections() {
		return sections;
	}

	/**
	 * @param sections the sections to set
	 */
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}

	/**
	 * @return the categories
	 */
	public List<String> getCategories() {
		return categories;
	}

	/**
	 * @param categories the categories to set
	 */
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}

	/**
	 * @return the tags
	 */
	public List<String> getTags() {
		return tags;
	}

	/**
	 * @param tags the tags to set
	 */
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

}
