package com.todo.todoApp.service.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TaskInDTO {
    private String title;
    private Boolean finished;
}
