package com.tree.spring.boot.model;

/**
 * Created by tree on 17-8-3.
 */
public class LearnResource {
    private String author;

    private String title;

    private String url;

    public LearnResource() {
    }

    public LearnResource(String author, String title, String url) {
        this.author = author;
        this.title = title;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
