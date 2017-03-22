package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.Organization;

import java.util.List;

public interface OrganizationService {
    List<Organization> getAll();
    Organization getById(long Id);
    Organization save(Organization organization);
    String delete(long id);
}
