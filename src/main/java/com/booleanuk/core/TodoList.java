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

    public void printList(ArrayList<Task> list, String description) {
        System.out.println("=== Task List (" + description + ") ===");
        if (list.isEmpty()) {
            System.out.println("\tNo tasks.");
        } else {
            for (Task task : list) {
                System.out.println("\tID #" + task.id() + ": " + task.title());
            }
        }
        System.out.println("=================");
    }

    public ArrayList<Task> listAll() {

        printList(this.tasks, "All");
        return this.tasks;
    }

    public ArrayList<Task> listAll(Status status) {

        ArrayList<Task> newTaskList = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.status() == status) {
                newTaskList.add(task);
            }
        }
        printList(newTaskList, status.toString());
        return newTaskList;
    }
}
