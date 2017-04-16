package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.Task;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public interface TaskService {
    List<Task> getAll();
    List<Task> getByUserId(long userId);
    List<Task> getByUserIdAndStatus(long userId, String status);
    Task getById(long id);
    Task save(Task task);
    String delete(long id);
}
