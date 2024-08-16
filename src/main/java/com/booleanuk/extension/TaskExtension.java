package com.booleanuk.extension;

import com.booleanuk.core.Status;

public class TaskExtension {
    private int id;
    private String title;
    private Status status;

    public TaskExtension(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = Status.INCOMPLETE;
    }

    public int id() {
        return this.id;
    }

    public String title() {
        return this.title;
    }

    public Status status() {
        return this.status;
    }

    public void changeStatus(Status status) {
        this.status = status;
    }

    public void changeTitle(String newTitle) {
        this.title = newTitle;
    }
}
