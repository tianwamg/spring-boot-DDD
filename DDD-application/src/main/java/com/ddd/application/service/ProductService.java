package com.ddd.application.service;

import com.ddd.domain.command.CreateProductCommand;
import com.ddd.domain.model.product.Product;
import com.ddd.domain.repository.ProductRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 参考 https://www.cnblogs.com/ahau10/tag/DDD/
 */
@Service
public class ProductService {

    @Resource
    ProductRepository productRepository;

    public Integer save(CreateProductCommand command){
        Product product = Product.of(command);
        return productRepository.save(product);
    }

    public List<Product> list(){
        List<Product> list = productRepository.findAll();
        return list;
    }
}
