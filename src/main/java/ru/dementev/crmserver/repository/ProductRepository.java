package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
