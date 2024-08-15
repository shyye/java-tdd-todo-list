package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

class TodoListTest {

    TodoList todoList;

    @Test
    public void addToListShouldReturnTrue() {
        this.todoList = new TodoList();
        Task task = new Task(1, "Code");
        Assertions.assertTrue(todoList.add(task));
        Assertions.assertEquals(1, todoList.size());
    }

    @Test
    public void listAllShouldReturnList() {
        // TODO: Not sure about this test, do I test the right things?
        // TODO: How do you check system.out.print-messages?

        this.todoList = new TodoList();
        Task task = new Task(1, "Code");
        Task task2 = new Task(2, "Draw");
        this.todoList.add(task);
        this.todoList.add(task2);

        ArrayList<Task> correctlist = new ArrayList<>();
        correctlist.add(task);
        correctlist.add(task2);

        ArrayList<Task> list = todoList.listAll();

        Assertions.assertTrue(list.containsAll(correctlist));
    }

    @Test
    public void listAllShouldReturnEmptyList() {
        this.todoList = new TodoList();

        ArrayList<Task> correctlist = new ArrayList<>();
        ArrayList<Task> list = todoList.listAll();

        Assertions.assertTrue(list.containsAll(correctlist));
    }

    @Test
    public void listAllShouldReturnOnlyCompletedTasks() {
        this.todoList = new TodoList();

        Task tasks[] = new Task[] {
                new Task(1, "Code"),
                new Task(2, "Draw").changeStatus(true),
                new Task(3, "Workout"),
                new Task(4, "Buy food").changeStatus(true)
        };
        for (Task task : tasks) {
            todoList.add(task);
        }

        ArrayList<Task> completedTasks = todoList.listAll(true);
        for (Task task : tasks) {
            Assertions.assertTrue(task.status());
        }
    }
}
