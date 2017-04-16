package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.MarketingOffers;

import java.util.List;

@Repository
public interface MarketingOffersRepository extends JpaRepository<MarketingOffers, Long> {

    @Query(value = "SELECT * FROM marketingOffers where clientId=?1 and organizationId=?2", nativeQuery = true)
    List<MarketingOffers> findByPersonIdAndOrganizationId(long personId, long organizationId);

}
