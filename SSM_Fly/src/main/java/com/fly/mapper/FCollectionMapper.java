package com.fly.mapper;

import com.fly.model.FCollection;

public interface FCollectionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FCollection record);

    int insertSelective(FCollection record);

    FCollection selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FCollection record);

    int updateByPrimaryKey(FCollection record);
}