package ru.dementev.crmserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.dementev.crmserver.entity.Position;
import ru.dementev.crmserver.service.PositionServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {
    @Autowired
    PositionServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Position> getAll(ModelMap model) {
        return service.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Position get(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    @ResponseBody
    public Position set(@RequestBody Position position){
        return service.save(position);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable long id){
        return service.delete(id);
    }

}
