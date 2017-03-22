package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.Product;

/**
 * Created by adementev on 22.03.2017.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
