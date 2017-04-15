package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.User;
import ru.dementev.crmserver.repository.UserRepository;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository repository;

    public User getId(long id) {
        return null;
    }

    public List<User> getAll() {
        return repository.findAll();
    }

    public User login(String login, String password) {
        return null;
    }

    public User logout(String login) {
        return null;
    }

    public User registration(User user) {
        return null;
    }
}
