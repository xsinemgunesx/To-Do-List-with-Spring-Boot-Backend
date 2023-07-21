package com.todoList.data.dto.user;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private Long id;
    private String name;
}
