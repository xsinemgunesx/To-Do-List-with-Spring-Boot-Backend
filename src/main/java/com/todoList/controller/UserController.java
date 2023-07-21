package com.todoList.controller;

import com.todoList.data.dto.task.DeleteTaskRequest;
import com.todoList.data.dto.task.TaskResponse;
import com.todoList.data.dto.task.UpdateTaskRequest;
import com.todoList.data.dto.user.DeleteUserRequest;
import com.todoList.data.dto.user.UpdateUserRequest;
import com.todoList.data.entity.TaskEntity;
import com.todoList.data.entity.UserEntity;
import com.todoList.service.UserService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RequestMapping(path = "/user", produces = {"application/json"})
public class UserController {

    private final UserService userService;



}
