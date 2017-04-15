package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.MarketingOffers;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public interface MarketingOffersService {

    List<MarketingOffers> getAll();
    List<MarketingOffers> getByPersonId(long personId);
    List<MarketingOffers> getByPersonIdAndOrganizationId(long personId, long organizationId);
    List<MarketingOffers> getByPersonIdAndOrganizationIdAndStatus(long personId, long organizationId,String status);
    List<MarketingOffers> getByPersonIdAndStatus(long personId,String status);
    MarketingOffers getById(long Id);
    MarketingOffers save(MarketingOffers marketingOffers);
    String delete(long id);
}
