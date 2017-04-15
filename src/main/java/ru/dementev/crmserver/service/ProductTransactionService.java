package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.ProductTransaction;

import java.util.List;

/**
 * Created by Антон Дементьев on 13.04.2017.
 */
public interface ProductTransactionService {
    List<ProductTransaction> getAll();
    ProductTransaction getById(long Id);
    ProductTransaction save(ProductTransaction productTransaction);
    String delete(long id);
}
