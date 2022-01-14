package com.ddd.domain.repository;

import com.ddd.domain.model.product.Product;

import java.util.List;

public interface ProductRepository {

    public Integer save(Product product);

    public List<Product> findAll();

}
