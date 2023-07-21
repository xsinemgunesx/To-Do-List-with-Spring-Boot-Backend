package com.todoList.data.dto.userTask;

import lombok.Data;

@Data
public class UpdateUserTaskRequest {
    private Long id;
    private String name;
}