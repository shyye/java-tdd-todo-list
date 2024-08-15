package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    private ArrayList<Task> tasks;
    private int size;

    public TodoList() {
        this.tasks = new ArrayList<>();
        this.size = 0;
    }

    public boolean add(Task task) {
        size++;
        return tasks.add(task);
    }

    public int size() {
        return this.size;
    }
}
