package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dementev.crmserver.entity.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
