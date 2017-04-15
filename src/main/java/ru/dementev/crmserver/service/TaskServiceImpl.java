package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.Task;
import ru.dementev.crmserver.repository.TaskRepository;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository repository;

    public List<Task> getAll() {
        return repository.findAll();
    }

    public List<Task> getByUserId(long userId) {
        return null;
    }

    public List<Task> getByUserIdAndStatus(long userId, String status) {
        return null;
    }

    public Task getById(long Id) {
        return null;
    }

    public Task save(Task task) {
        return null;
    }

    public String delete(long id) {
        return null;
    }
}
