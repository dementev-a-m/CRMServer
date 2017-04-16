package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.ProductTransaction;
import ru.dementev.crmserver.repository.ProductTransactionRepository;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public class ProductTransactionServiceImpl implements ProductTransactionService {
    @Autowired
    ProductTransactionRepository repository;

    public List<ProductTransaction> getAll() {
        return repository.findAll();
    }

    public ProductTransaction getById(long id) {
        return null;
    }

    public ProductTransaction save(ProductTransaction productTransaction) {
        return null;
    }

    public String delete(long id) {
        return null;
    }
}
