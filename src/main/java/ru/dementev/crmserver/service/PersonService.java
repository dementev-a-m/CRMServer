package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.Person;

import java.util.List;

public interface PersonService {
    List<Person> getAll();
    Person getById(long Id);
    Person save(Person person);
    String delete(long id);
}
