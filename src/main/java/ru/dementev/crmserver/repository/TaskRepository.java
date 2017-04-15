package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.Task;


public interface TaskRepository extends JpaRepository<Task,Long> {
}
