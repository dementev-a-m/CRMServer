package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.dementev.crmserver.entity.Person;
import ru.dementev.crmserver.repository.PersonRepository;

import java.util.List;

@Service
public class PersonServiceImpl implements  PersonService {
    @Autowired
    PersonRepository personRepository;

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person getById(long Id) {
        return personRepository.findOne(Id);
    }

    public Person save(Person person) {

        return personRepository.saveAndFlush(person);
    }
    public String delete(long id) {
        personRepository.delete(id);
        return "Запись удалена";
    }
}
