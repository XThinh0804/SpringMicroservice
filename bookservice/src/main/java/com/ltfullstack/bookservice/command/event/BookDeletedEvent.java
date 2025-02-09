package com.ltfullstack.bookservice.command.event;

public class BookDeletedEvent {
    private String id;

    public BookDeletedEvent() {
    }

    public BookDeletedEvent(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
