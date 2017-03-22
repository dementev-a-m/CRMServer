package ru.dementev.crmserver.service;

import ru.dementev.crmserver.entity.Product;

import java.util.List;

/**
 * Created by adementev on 22.03.2017.
 */
public interface ProductService {
    List<Product> getAll();
    Product getById(long Id);
    Product save(Product product);
    String delete(long id);
}
