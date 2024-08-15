package com.booleanuk.core;

public class Task {

    private int id;
    private String title;
    private boolean status;

    // TODO: Do I need to do something specific to make arguments/parameters required to fill in?
    // TODO: How to validate in a constructor?
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = false;
    }

    public int id() {
        return this.id;
    }

    public String title() {
        return this.title;
    }
}
