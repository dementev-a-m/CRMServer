package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.Transaction;
import ru.dementev.crmserver.repository.TransactionRepository;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public class TransactionServiceImpl implements TransactionService{
    @Autowired
    TransactionRepository repository;

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public List<Transaction> getByPersonId(long personId) {
        return null;
    }

    public List<Transaction> getByPersonIdAndOrganizationId(long personId, long organizationId) {
        return null;
    }

    public List<Transaction> getByPersonIdAndOrganizationIdAndStatus(long personId, long organizationId, String status) {
        return null;
    }

    public List<Transaction> getByPersonIdAndStatus(long personId, String status) {
        return null;
    }

    public List<Transaction> getByUserId(long userId) {
        return null;
    }

    public List<Transaction> getByUserIdAndStatus(long userId, String status) {
        return null;
    }

    public Transaction getById(long Id) {
        return null;
    }

    public Transaction save(Transaction transaction) {
        return null;
    }

    public String delete(long id) {
        return null;
    }
}
