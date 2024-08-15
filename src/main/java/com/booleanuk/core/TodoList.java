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

    public void printList(ArrayList<Task> list) {
        System.out.println("=== Task List ===");
        if (list.size() == 0) {
            System.out.println("\tNo tasks.");
        } else {
            for (Task task : this.tasks) {
                System.out.println("\tID #" + task.id() + ": " + task.title());
            }
        }
        System.out.println("=================");
    }

    public ArrayList<Task> listAll() {

        printList(this.tasks);
        return this.tasks;
    }

    public ArrayList<Task> listAll(boolean status) {

        ArrayList<Task> newTaskList = new ArrayList<>();
        for (Task task : this.tasks) {
            if (task.status() == status) {
                newTaskList.add(task);
            }
        }
        return newTaskList;
    }
}
