package com.fly.mapper;

import com.fly.model.FStatelBasicData;

public interface FStatelBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FStatelBasicData record);

    int insertSelective(FStatelBasicData record);

    FStatelBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FStatelBasicData record);

    int updateByPrimaryKey(FStatelBasicData record);
}