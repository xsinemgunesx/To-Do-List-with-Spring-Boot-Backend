package com.todoList.data.dto.task;

import lombok.Data;

@Data//GET VE SET OLUŞTURUR OTOMATİK
public class CreateTaskRequest { // kullanıcıdan aldığımız isim
    private String name;
}
