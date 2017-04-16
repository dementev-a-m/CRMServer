package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.MarketingOffers;
import ru.dementev.crmserver.repository.MarketingOffersRepository;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public class MarketingOffersServiceImpl implements MarketingOffersService {
    @Autowired
    MarketingOffersRepository repository;

    public List<MarketingOffers> getAll() {
        return repository.findAll();
    }

    public List<MarketingOffers> getByPersonId(long personId) {
        return null;
    }

    public List<MarketingOffers> getByPersonIdAndOrganizationId(long personId, long organizationId) {
        return repository.findByPersonIdAndOrganizationId(personId,organizationId);
    }

    public List<MarketingOffers> getByPersonIdAndOrganizationIdAndStatus(long personId, long organizationId, String status) {
        return null;
    }

    public List<MarketingOffers> getByPersonIdAndStatus(long personId, String status) {
        return null;
    }

    public MarketingOffers getById(long id) {
        return null;
    }

    public MarketingOffers save(MarketingOffers marketingOffers) {
        return null;
    }

    public String delete(long id) {
        return null;
    }
}
