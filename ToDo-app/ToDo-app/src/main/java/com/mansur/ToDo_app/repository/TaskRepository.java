package com.mansur.ToDo_app.repository;

import com.mansur.ToDo_app.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
