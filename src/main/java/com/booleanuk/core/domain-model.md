| Class                        | Variables               | Methods                        | Scenario                                                        | Outputs                              |
|------------------------------|-------------------------|--------------------------------|-----------------------------------------------------------------|--------------------------------------|
| `TodoList`                   | `ArrayList<Task> tasks` | `add(Task task)`               | Task is added to list.                                          | true                                 |
|                              |                         |                                | Task can't be added to list.                                    | false                                |
|                              |                         | `listAll()`                    | There is tasks in todo list.                                    | List, all tasks                      |
|                              |                         |                                | There is no tasks.                                              | Show error message                   |
|                              |                         | `listAll(boolean status)`      | List all tasks that have status true.                           | List, only tasks that are complete   |
|                              |                         |                                | List all tasks that have status false.                          | List, only tasks that are incomplete |
|                              |                         | `sort(String order)`           | Sort list in ascending order.                                   | Sorted list, ascending               |
|                              |                         |                                | Sort list in descending order.                                  | Sorted list, descending              |
|                              |                         | `search(String taskTitle)`     | If task exist.                                                  | true; Show task                      |
|                              |                         |                                | If task doesn't exist.                                          | false; Show error message            |
|                              |                         | `remove(int taskId)`           | Remove task from todo list. Task exist.                         | true                                 |
|                              |                         |                                | Remove task from todo list. Task doesn't exist.                 | false                                |
| `Task(int id, String title)` | `int id`                | `id()`                         | Get id to present id so user can remove task based on id later. |                                      |
|                              |                         | `get(int id)`                  | Get Task based on id. Task exists.                              | Task                                 |
|                              |                         |                                | Get Task based on id. Task doesn't exist.                       | null                                 |
|                              | `String title`          | `title()`                      | Get title of this task.                                         | String                               |
|                              | `boolean Status`        | `changeStatus(boolean status)` | Change status to true.                                          | Status is complete                   |
|                              |                         |                                | Change status to false.                                         | Status is incomplete                 |
|                              |                         | `status()`                     | Get status for this task.                                       | true/false                           |
