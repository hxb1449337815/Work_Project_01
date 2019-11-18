package com.xb.model;

public class News {

    private Integer id;
    private String title;
    private String details;

    public News(String title, String details) {
        this.title = title;
        this.details = details;
    }

    public News() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", details='" + details + '\'' +
                '}';
    }
}

