package ru.dementev.crmserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.dementev.crmserver.entity.MarketingOffers;
import ru.dementev.crmserver.service.MarketingOffersService;

import java.util.List;

@RestController
@RequestMapping("/marketingoffers")
public class MarketingOffersController {
    @Autowired
    MarketingOffersService service;

    @RequestMapping(value = "/get/all", method = RequestMethod.GET)
    @ResponseBody
    public List<MarketingOffers> getAll(ModelMap model) {
        return service.getAll();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public MarketingOffers get(@PathVariable long id){
        return service.getById(id);
    }

    @RequestMapping(value = "/set", method = RequestMethod.POST)
    @ResponseBody
    public MarketingOffers set(@RequestBody MarketingOffers marketingOffers){
        return service.save(marketingOffers);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable long id){
        return service.delete(id);
    }



}
