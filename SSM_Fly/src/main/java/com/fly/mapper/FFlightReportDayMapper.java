package com.fly.mapper;

import com.fly.model.FFlightReportDay;

public interface FFlightReportDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FFlightReportDay record);

    int insertSelective(FFlightReportDay record);

    FFlightReportDay selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FFlightReportDay record);

    int updateByPrimaryKey(FFlightReportDay record);
}