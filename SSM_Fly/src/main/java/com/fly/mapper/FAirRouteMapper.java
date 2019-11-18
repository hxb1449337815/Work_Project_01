package com.fly.mapper;

import com.fly.model.FAirRoute;

public interface FAirRouteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FAirRoute record);

    int insertSelective(FAirRoute record);

    FAirRoute selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FAirRoute record);

    int updateByPrimaryKey(FAirRoute record);
}