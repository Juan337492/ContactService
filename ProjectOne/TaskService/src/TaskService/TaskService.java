package TaskService;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<String, Task> tasks;

    public TaskService() {
        this.tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    public void deleteTask(String taskId) {
        tasks.remove(taskId);
    }

    public void updateTaskName(String taskId, String newName) {
        if (tasks.containsKey(taskId)) {
            Task task = tasks.get(taskId);
            task = new Task(taskId, newName, task.getDescription());
            tasks.put(taskId, task);
        }
    }

    public void updateTaskDescription(String taskId, String newDescription) {
        if (tasks.containsKey(taskId)) {
            Task task = tasks.get(taskId);
            task = new Task(taskId, task.getName(), newDescription);
            tasks.put(taskId, task);
        }
    }

    public Map<String, Task> getTasks() {
        return tasks;
    }
}
