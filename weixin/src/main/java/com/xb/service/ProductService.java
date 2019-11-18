package com.xb.service;

import com.xb.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getDiscountList();
    List<Product> getHotList();
    List<Product> getProductList();
    List<Product> getUnlookList();
    Product getProductById(Integer id);
    String getTypeById(Integer id);

}
