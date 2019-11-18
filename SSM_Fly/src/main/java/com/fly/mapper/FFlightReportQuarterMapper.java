package com.fly.mapper;

import com.fly.model.FFlightReportQuarter;

public interface FFlightReportQuarterMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FFlightReportQuarter record);

    int insertSelective(FFlightReportQuarter record);

    FFlightReportQuarter selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FFlightReportQuarter record);

    int updateByPrimaryKey(FFlightReportQuarter record);
}