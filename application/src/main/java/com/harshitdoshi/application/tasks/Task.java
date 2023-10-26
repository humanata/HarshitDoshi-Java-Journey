package com.harshitdoshi.application.tasks;

import java.util.UUID;

// Using Records instead of Classes
// Records were introduced with Java 16
// Under the hood, Records are type of Classes themselves
// The core reason for records getting intriduced in Java is
// for DTO or DTO-type usage (data-models, ORM-like functionality)
public record Task(UUID id, String title, String status) {

}

// The same Task can be written in the form of a Class as below:

// public class Task {
//     private final UUID id;
//     private final String title;
//     private final String status;

//     public Task(UUID id, String title, String status) {
//         this.id = id;
//         this.title = title;
//         this.status = status;
//     }

//     public String getTitle() {
//         return title;
//     }

//     public String getStatus() {
//         return status;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         Task task = (Task) o;
//         return (id == task.id && title == task.title && status == task.status);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(id, title, status);
//     }

//     @Override
//     public String toString() {
//         return "Task{"
//                 + "id=" + id.toString()
//                 + ",title=" + title
//                 + ",status=" + status
//                 + "}";
//     }
// }
