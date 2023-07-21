package com.todoList.data.repository;

import com.todoList.data.entity.TaskEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends BaseRepository<TaskEntity> { // veri tabanına erişmemizi sağlar
}
