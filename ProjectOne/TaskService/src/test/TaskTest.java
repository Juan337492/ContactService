package test;

import TaskService.Task;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testTaskCreation() {
        Task task = new Task("T1", "Task 1", "Description for Task 1");
        assertEquals("T1", task.getTaskId());
        assertEquals("Task 1", task.getName());
        assertEquals("Description for Task 1", task.getDescription());
    }

   
}
