package com.todoList.service;

import com.todoList.data.dto.task.CreateTaskRequest;
import com.todoList.data.dto.task.DeleteTaskRequest;
import com.todoList.data.dto.task.TaskResponse;
import com.todoList.data.dto.task.UpdateTaskRequest;
import com.todoList.data.entity.TaskEntity;
import com.todoList.data.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService { //controller isteklerimizi service'e gönderiyor. serviste yaptığımız işlemler db'ye gidiyor.

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public String createTask(CreateTaskRequest createTaskRequest) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setName(createTaskRequest.getName());
        taskRepository.save(taskEntity);//backende verdiğim taskEntity'i kaydedecek db'ye
        return "TaskEntity oluşturuldu.";
    }
    public List<TaskResponse> getTaskList(){//veri tabanındaki task'leri listelemek
        List<TaskEntity> taskEntities = taskRepository.findAll();//veri tabanındaki taskleri listeleriz
        List<TaskResponse> responseList =new ArrayList();
        for (TaskEntity t : taskEntities) {
            TaskResponse taskResponse = new TaskResponse();//kullanıcıya göstermek için listeleriz
            taskResponse.setId(t.getId());
            taskResponse.setName(t.getName());
            responseList.add(taskResponse);

        }
        return responseList;
    }
    public String updateTask(UpdateTaskRequest updateTaskRequest) {
        try {
            TaskEntity taskEntity = taskRepository.findById(updateTaskRequest.getId()).get();//kullanıcıdan aldığımız id'yi veri tabanında bulup entity'e aktarma
            if(taskEntity != null)
            {
                taskEntity.setName(updateTaskRequest.getName());
                taskRepository.save(taskEntity);
            }
        }catch(Exception e) {

        }
        return "TaskEntity güncelendi";
    }
    public void deleteTask(DeleteTaskRequest deleteTaskRequest ) {
        taskRepository.deleteById(deleteTaskRequest.getId());


    }
}
