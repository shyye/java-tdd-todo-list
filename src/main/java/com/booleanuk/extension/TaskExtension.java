package com.booleanuk.extension;

import com.booleanuk.extension.StatusExtension;

public class TaskExtension {
    private int id;
    private String title;
    private StatusExtension status;

    public TaskExtension(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = StatusExtension.INCOMPLETE;
    }

    public int id() {
        return this.id;
    }

    public String title() {
        return this.title;
    }

    public StatusExtension status() {
        return this.status;
    }

    public void changeStatus(StatusExtension status) {
        this.status = status;
    }

    public void changeTitle(String newTitle) {
        this.title = newTitle;
    }
}
