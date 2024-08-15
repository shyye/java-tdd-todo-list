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

    public ArrayList<Task> listAll() {

        System.out.println("=== Task List ===");
        if (this.tasks.size() == 0) {
            System.out.println("\tNo tasks.");
        } else {
            for (Task task : this.tasks) {
                System.out.println("\tID #" + task.id() + ": " + task.title());
            }
        }
        System.out.println("=================");

        return this.tasks;
    }
}
