package com.ddd.infrastructure.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ddd.domain.model.product.Product;
import com.ddd.domain.repository.ProductRepository;
import com.ddd.infrastructure.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProductRepositoryImpl implements ProductRepository {

    @Resource
    ProductMapper productMapper;

    @Override
    public Integer save(Product product) {
        return productMapper.insert(product);
    }

    public List<Product> findAll(){
        QueryWrapper<Product> queryWrapper = new QueryWrapper<>();
        return productMapper.selectList(queryWrapper);
    }
}
