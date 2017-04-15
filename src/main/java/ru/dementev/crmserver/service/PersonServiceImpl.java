package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dementev.crmserver.entity.Person;
import ru.dementev.crmserver.repository.PersonRepository;

import java.util.List;

@Service
public class  PersonServiceImpl implements  PersonService {
    @Autowired
    PersonRepository repository;

    public List<Person> getAll() {
        return repository.findAll();
    }

    public Person getById(long Id) {
        return repository.findOne(Id);
    }

    public Person save(Person person) {

        return repository.saveAndFlush(person);
    }
    public String delete(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
