package com.harshitdoshi.application.tasks;

import java.util.UUID;

public record Task(UUID id, String title, String status) {
    
}
