package ru.dementev.crmserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dementev.crmserver.entity.Transaction;

/**
 * Created by adementev on 22.03.2017.
 */
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
