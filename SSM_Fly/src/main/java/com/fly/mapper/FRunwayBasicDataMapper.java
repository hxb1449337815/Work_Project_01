package com.fly.mapper;

import com.fly.model.FRunwayBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FRunwayBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FRunwayBasicData record);

    int insertSelective(FRunwayBasicData record);

    FRunwayBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FRunwayBasicData record);

    int updateByPrimaryKey(FRunwayBasicData record);

    @Select("select * from f_runway_basic_data")
    List<FRunwayBasicData> getRunwayList();
}