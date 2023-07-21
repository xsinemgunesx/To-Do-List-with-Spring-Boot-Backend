package com.todoList.controller;

import com.todoList.data.dto.task.TaskResponse;
import com.todoList.data.dto.user.DeleteUserRequest;
import com.todoList.data.dto.user.UpdateUserRequest;
import com.todoList.data.dto.userTask.DeleteUserTaskRequest;
import com.todoList.data.dto.userTask.UpdateUserTaskRequest;
import com.todoList.data.dto.userTask.UserTaskResponse;
import com.todoList.data.entity.TaskEntity;
import com.todoList.data.entity.UserEntity;
import com.todoList.data.entity.UserTaskEntity;
import com.todoList.service.UserTaskService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
@RequestMapping(path = "/userTask", produces = {"application/json"})
public class UserTaskController {

    private final UserTaskService userTaskService;


}
