package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAll();
    List<Transaction> getByPersonId(long personId);
    List<Transaction> getByPersonIdAndOrganizationId(long personId, long organizationId);
    List<Transaction> getByPersonIdAndOrganizationIdAndStatus(long personId, long organizationId,String status);
    List<Transaction> getByPersonIdAndStatus(long personId,String status);
    Transaction getById(long id);
    Transaction save(Transaction transaction);
    String delete(long id);
}
