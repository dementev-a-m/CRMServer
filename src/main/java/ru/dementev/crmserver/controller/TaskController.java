package ru.dementev.crmserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.dementev.crmserver.entity.Task;
import ru.dementev.crmserver.service.TaskServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Task> getAll(ModelMap model) {
        return service.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Task get(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    @ResponseBody
    public Task set(@RequestBody Task task){
        return service.save(task);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable long id){
        return service.delete(id);
    }

}
