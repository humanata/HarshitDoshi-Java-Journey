package com.harshitdoshi.application.tasks;

import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    private final UUID id = UUID.randomUUID();

    @GetMapping("/tasks")
    public Task readTasks(@RequestParam(value = "title", defaultValue = "foo bar") String title) {
        return new Task(id, title, "todo");
    }
}
