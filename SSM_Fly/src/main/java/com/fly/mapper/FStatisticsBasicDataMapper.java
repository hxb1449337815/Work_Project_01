package com.fly.mapper;

import com.fly.model.FStatisticsBasicData;

public interface FStatisticsBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FStatisticsBasicData record);

    int insertSelective(FStatisticsBasicData record);

    FStatisticsBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FStatisticsBasicData record);

    int updateByPrimaryKey(FStatisticsBasicData record);
}