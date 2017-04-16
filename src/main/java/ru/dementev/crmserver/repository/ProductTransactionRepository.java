package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.ProductTransaction;

@Repository
public interface ProductTransactionRepository extends JpaRepository<ProductTransaction,Long> {
}
