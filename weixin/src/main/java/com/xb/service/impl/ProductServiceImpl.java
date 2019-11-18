package com.xb.service.impl;

import com.xb.mapper.ProductMapper;
import com.xb.model.Product;
import com.xb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<Product> getDiscountList() {
        return mapper.getDiscountList();
    }

    @Override
    public List<Product> getHotList() {
        return mapper.getHotList();
    }

    @Override
    public List<Product> getProductList() {
        return mapper.getProductList();
    }

    @Override
    public List<Product> getUnlookList() {
        return mapper.getUnlookList();
    }

    @Override
    public Product getProductById(Integer id) {
        return mapper.getProductById(id);
    }

    @Override
    public String getTypeById(Integer id) {
        return mapper.getTypeById(id);
    }
}
