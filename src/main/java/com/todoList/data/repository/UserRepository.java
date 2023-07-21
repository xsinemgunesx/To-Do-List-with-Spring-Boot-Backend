package com.todoList.data.repository;

import com.todoList.data.entity.UserTaskEntity;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserRepository extends BaseRepository<UserTaskEntity> {
}
