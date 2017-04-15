package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.MarketingOffers;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public interface MarketingOffersRepository extends JpaRepository<MarketingOffers, Long> {
}
