package com.fly.mapper;

import com.fly.model.FAirlineCompany;

public interface FAirlineCompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FAirlineCompany record);

    int insertSelective(FAirlineCompany record);

    FAirlineCompany selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FAirlineCompany record);

    int updateByPrimaryKey(FAirlineCompany record);
}