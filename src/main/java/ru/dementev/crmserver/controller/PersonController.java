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
    PersonServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> getAll(ModelMap model) {
        return service.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Person get(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    @ResponseBody
    public Person set(@RequestBody Person person){
        return service.save(person);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable long id){
        return service.delete(id);
    }



}
