package ru.dementev.crmserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import ru.dementev.crmserver.entity.Product;
import ru.dementev.crmserver.repository.ProductRepository;

import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository repository;
    public List<Product> getAll() {
        return repository.findAll();
    }

    public List<Product> getByOrganizationId(long organizationId) {
        return null;
    }

    public List<Product> getByType(String type) {
        return null;
    }

    public Product getById(long Id) {
        return null;
    }

    public Product save(Product product) {
        return null;
    }

    public String delete(long id) {
        return null;
    }
}
