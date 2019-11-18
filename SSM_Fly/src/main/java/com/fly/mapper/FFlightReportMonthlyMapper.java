package com.fly.mapper;

import com.fly.model.FFlightReportMonthly;

public interface FFlightReportMonthlyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FFlightReportMonthly record);

    int insertSelective(FFlightReportMonthly record);

    FFlightReportMonthly selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FFlightReportMonthly record);

    int updateByPrimaryKey(FFlightReportMonthly record);
}