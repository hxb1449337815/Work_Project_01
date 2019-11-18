package com.fly.mapper;

import com.fly.model.FFlightReportYear;

public interface FFlightReportYearMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FFlightReportYear record);

    int insertSelective(FFlightReportYear record);

    FFlightReportYear selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FFlightReportYear record);

    int updateByPrimaryKey(FFlightReportYear record);
}