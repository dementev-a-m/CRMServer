package ru.dementev.crmserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.dementev.crmserver.entity.Organization;
import ru.dementev.crmserver.service.OrganizationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/organization")

public class OrganizationController {
    @Autowired
    OrganizationServiceImpl service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Organization> getAll(ModelMap model) {
        return service.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Organization get(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    @ResponseBody
    public Organization set(@RequestBody Organization organization){
        return service.save(organization);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable long id){
        return service.delete(id);
    }

}
