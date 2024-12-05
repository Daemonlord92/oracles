package org.blitmatthew;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    static class Task {
        private String description;
        private LocalDate dueDate;
        private boolean isComplete;

        // TODO: Add constructor and getters/setters
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        // TODO:
        // 1. Add several tasks with different due dates
        // 2. Use lambda to filter tasks due today
        // 3. Use lambda to sort tasks by due date
        // 4. Use lambda to mark tasks as complete
        // 5. Use lambda to get statistics about completed vs incomplete tasks
    }
}
