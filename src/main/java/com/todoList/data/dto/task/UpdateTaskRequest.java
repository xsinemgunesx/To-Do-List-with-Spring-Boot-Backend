package com.todoList.data.dto.task;

import lombok.Data;

@Data
public class UpdateTaskRequest { // veri tabanından aldığımız bilgiler
    private Long id;
    private String name;

}
