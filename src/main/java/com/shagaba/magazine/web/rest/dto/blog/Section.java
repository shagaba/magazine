package com.shagaba.magazine.web.rest.dto.blog;

import java.util.List;

public class Section {

    protected String title;

    protected List<Paragraph> paragraphs;

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
     * @return the paragraphs
     */
    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    /**
     * @param paragraphs the paragraphs to set
     */
    public void setParagraphs(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

}
