package test;

import TaskService.Task;
import TaskService.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest {
    private TaskService taskService;

    @BeforeEach
    public void setUp() {
        taskService = new TaskService();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("T1", "Task 1", "Description for Task 1");
        taskService.addTask(task);
        assertEquals(1, taskService.getTasks().size());
    }

    @Test
    public void testDeleteTask() {
        Task task = new Task("T1", "Task 1", "Description for Task 1");
        taskService.addTask(task);
        taskService.deleteTask("T1");
        assertEquals(0, taskService.getTasks().size());
    }

    @Test
    public void testUpdateTaskName() {
        Task task = new Task("T1", "Task 1", "Description for Task 1");
        taskService.addTask(task);
        taskService.updateTaskName("T1", "New Task Name");
        assertEquals("New Task Name", taskService.getTasks().get("T1").getName());
    }

    @Test
    public void testUpdateTaskDescription() {
        Task task = new Task("T1", "Task 1", "Description for Task 1");
        taskService.addTask(task);
        taskService.updateTaskDescription("T1", "New Description");
        assertEquals("New Description", taskService.getTasks().get("T1").getDescription());
    }

}
