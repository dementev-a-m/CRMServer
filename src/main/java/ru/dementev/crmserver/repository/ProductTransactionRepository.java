package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.ProductTransaction;


public interface ProductTransactionRepository extends JpaRepository<ProductTransaction,Long> {
}
