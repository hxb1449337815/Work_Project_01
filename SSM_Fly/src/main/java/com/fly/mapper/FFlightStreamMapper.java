package com.fly.mapper;

import com.fly.model.FFlightStream;

public interface FFlightStreamMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FFlightStream record);

    int insertSelective(FFlightStream record);

    FFlightStream selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FFlightStream record);

    int updateByPrimaryKey(FFlightStream record);
}