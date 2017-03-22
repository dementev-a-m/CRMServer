package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.User;

/**
 * Created by adementev on 22.03.2017.
 */
public interface UserService {
    public User login(String login,String password);
    public User logout(String login);
    public User registration(User user);
}
