package com.ltfullstack.bookservice.query.model;

public class BookResponseModel {
    private String id;
    private String name;
    private String author;
    private Boolean isReady;

    public BookResponseModel() {
    }

    public BookResponseModel(String id, String name, Boolean isReady, String author) {
        this.id = id;
        this.name = name;
        this.isReady = isReady;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getIsReady() {
        return isReady;
    }

    public void setIsReady(Boolean ready) {
        isReady = ready;
    }
}
