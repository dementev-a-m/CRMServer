package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.User;

import java.util.List;

/**
 * Created by adementev on 22.03.2017.
 */
public interface UserService {
    public User getId(long id);
    public List<User> getAll();
    public User login(String login,String password);
    public User logout(String login);
    public User registration(User user);
}
