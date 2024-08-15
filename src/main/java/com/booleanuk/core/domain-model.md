| Class                        | Variables               | Methods                                               | Scenario                                                        | Outputs                              |
|------------------------------|-------------------------|-------------------------------------------------------|-----------------------------------------------------------------|--------------------------------------|
| `TodoList`                   | `ArrayList<Task> tasks` | `add(Task task)`                                      | Task is added to list.                                          | true                                 |
|                              | `int size`              |                                                       | Task can't be added to list.                                    | false                                |
|                              |                         | `listAll()`                                           | There is tasks in todo list.                                    | List, all tasks                      |
|                              |                         |                                                       | There is no tasks.                                              | Show message                         |
|                              |                         | `listAll(Status status)` (enum)                       | List all tasks that have status completed.                      | List, only tasks that are complete   |
|                              |                         |                                                       | List all tasks that have status incompleted.                    | List, only tasks that are incomplete |
|                              |                         | `sortedList(Order order)` (enum)                      | Sort list in ascending order.                                   | Sorted list, ascending               |
|                              |                         |                                                       | Sort list in descending order.                                  | Sorted list, descending              |
|                              |                         | `search(String taskTitle)`                            | If task exist.                                                  | true; Show task                      |
|                              |                         |                                                       | If task doesn't exist.                                          | false; Show error message            |
|                              |                         | `remove(int taskId)`                                  | Remove task from todo list. Task exist.                         | true                                 |
|                              |                         |                                                       | Remove task from todo list. Task doesn't exist.                 | false                                |
|                              |                         | `printList(ArrayList<Task> list, String description)` | Print provided list. List is not empty.                         | Printed list                         |
|                              |                         |                                                       | Print provided list. List is empty.                             | Printed empty list with message      |
| `Task(int id, String title)` | `int id`                | `id()`                                                | Get id to present id so user can remove task based on id later. |                                      |
|                              |                         | `get(int id)`                                         | Get Task based on id. Task exists.                              | Task                                 |
|                              |                         |                                                       | Get Task based on id. Task doesn't exist.                       | null                                 |
|                              | `String title`          | `title()`                                             | Get title of this task.                                         | String                               |
|                              | `boolean Status`        | `changeStatus(boolean status)`                        | Change status to true (complete).                               | -                                    |
|                              |                         |                                                       | Change status to false (incomplete).                            | -                                    |
|                              |                         | `status()`                                            | Get status for this task.                                       | true/false                           |
| `enum Status`                | `COMPLETE, INCOMPLETE`  |                                                       |                                                                 |                                      |
| `enum Order`                 | `ASCENDING, DESCENDING` |                                                       |                                                                 |                                      |


## Core Requirements
- [x] I want to add tasks to my todo list.
- [x] I want to see all the tasks in my todo list.
- [x] I want to change the status of a task between incomplete and complete.
- [x] I want to be able to get only the complete tasks.
- [x] I want to be able to get only the incomplete tasks.
- [ ] I want to search for a task and receive a message that says it wasn't found if it doesn't exist.
- [ ] I want to remove tasks from my list.
- [ ] I want to see all the tasks in my list ordered alphabetically in ascending order.
- [ ] I want to see all the tasks in my list ordered alphabetically in descending order.