package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task,Long> {
}
