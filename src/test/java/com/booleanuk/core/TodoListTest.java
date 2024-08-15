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

        this.todoList = new TodoList();
        Task task = new Task(1, "Code");
        Task task2 = new Task(2, "Draw");

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
}
