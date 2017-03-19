package ru.dementev.crmserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/person")
public class PersonController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public String getPerson(ModelMap model) {
        return "Person";
    }

}
