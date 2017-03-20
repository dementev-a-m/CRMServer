package ru.dementev.crmserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.dementev.crmserver.entity.Person;
import ru.dementev.crmserver.service.PersonServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {
    @Autowired
    PersonServiceImpl personService;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> getAllPerson(ModelMap model) {
        return personService.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Person getPerson(@PathVariable long id){
        return personService.getById(id);
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    @ResponseBody
    public Person setPerson(@RequestBody Person person){
        return personService.save(person);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deletePerson(@PathVariable long id){
        personService.delete(id);
    }



}
