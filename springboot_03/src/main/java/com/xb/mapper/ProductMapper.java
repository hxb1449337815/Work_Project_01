package com.xb.mapper;


import com.xb.model.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductMapper {

    @Select("select * from product where discount=1 limit 0,3")
    List<Product> getDiscountList();

    @Select("select * from product where hot=1 limit 0,4")
    List<Product> getHotList();

    @Select("select * from product")
    List<Product> getProductList();

    @Select("select * from product where type=6")
    List<Product> getUnlookList();

    @Select("select * from product where id=#{id}")
    Product getProductById(Integer id);

    @Select("select remark from type where id=#{id}")
    String getTypeById(Integer id);


}
