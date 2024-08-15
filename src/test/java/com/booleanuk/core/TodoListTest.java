package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {

    TodoList todoList;

    @Test
    public void addToListShouldReturnTrue() {
        this.todoList = new TodoList();
        Task task = new Task(1, "Code");
        Assertions.assertTrue(todoList.add(task));
        Assertions.assertEquals(1, todoList.size());
    }
}
