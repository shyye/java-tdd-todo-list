package com.booleanuk.core;

public class Task {

    private int id;
    private String title;
    private boolean status;

    // TODO: Do I need to do something specific to make arguments/parameters required to fill in?
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
    }
}
