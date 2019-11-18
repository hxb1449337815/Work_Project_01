package com.fly.mapper;

import com.fly.model.FFlightReportWeekly;

public interface FFlightReportWeeklyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FFlightReportWeekly record);

    int insertSelective(FFlightReportWeekly record);

    FFlightReportWeekly selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FFlightReportWeekly record);

    int updateByPrimaryKey(FFlightReportWeekly record);
}