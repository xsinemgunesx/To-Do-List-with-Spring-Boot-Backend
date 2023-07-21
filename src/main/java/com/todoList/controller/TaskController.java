package com.todoList.controller;


import com.todoList.data.dto.task.CreateTaskRequest;
import com.todoList.data.dto.task.DeleteTaskRequest;
import com.todoList.data.dto.task.TaskResponse;
import com.todoList.data.dto.task.UpdateTaskRequest;
import com.todoList.service.TaskService;
import com.todoList.swagger.SpringFoxConfig;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/task", produces = {"application/json"})
@Api(tags = {SpringFoxConfig.TASK_TAG})
public class TaskController {//controller servise gönderir

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/create")
    @ApiOperation(value = "/task_olustur", notes ="note")
    public String createTask(@RequestBody CreateTaskRequest createTaskRequest) {// kullanıcıdan alınan veri modeli

        return taskService.createTask(createTaskRequest);
    }
    @GetMapping("/getTask")
    @ApiOperation(value = "/task_getir", notes ="note")

    public List<TaskResponse> getTask() {// kullanıcıdan alınan veri modeli

        return taskService.getTaskList();
    }
    @PostMapping("/updateTask")
    @ApiOperation(value = "/task_güncelle", notes ="note")
    public  String updateTask(@RequestBody UpdateTaskRequest updateTaskRequest) {// kullanıcıdan alınan veri modeli

        return taskService.updateTask(updateTaskRequest);
    }
    @PostMapping("/deleteTask")
    @ApiOperation(value = "/task_sil", notes ="note")
    public  void deleteTask(@RequestBody DeleteTaskRequest deleteTaskRequest) {// kullanıcıdan alınan veri modeli
        taskService.deleteTask(deleteTaskRequest);

    }

}
