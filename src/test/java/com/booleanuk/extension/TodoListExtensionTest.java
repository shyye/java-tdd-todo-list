package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodoListExtensionTest {
    TodoListExtension todoList;

    @Test
    public void getTaskById() {
        todoList = new TodoListExtension();
        TaskExtension task = new TaskExtension(1, "Code a project");
        todoList.add(task);

        // Try to get task that exist
        Assertions.assertEquals(task, todoList.getTask(1));

        // Try to get task that dpesn't exist
        Assertions.assertEquals(null, todoList.getTask(2));
    }
}
