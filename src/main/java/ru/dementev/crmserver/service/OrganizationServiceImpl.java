package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.Organization;
import ru.dementev.crmserver.repository.OrganizationRepository;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public class OrganizationServiceImpl implements OrganizationService {
    @Autowired
    OrganizationRepository repository;
    public List<Organization> getAll() {
        return repository.findAll();
    }

    public Organization getById(long id) {
        return repository.findOne(id);
    }

    public Organization save(Organization organization) {
        return repository.saveAndFlush(organization);
    }

    public String delete(long id) {
        repository.delete(id);
        return "Запись удалена";
    }
}
