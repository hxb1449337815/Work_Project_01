package com.fly.mapper;

import com.fly.model.FAirportBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FAirportBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FAirportBasicData record);

    int insertSelective(FAirportBasicData record);

    FAirportBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FAirportBasicData record);

    int updateByPrimaryKey(FAirportBasicData record);

    @Select("select * from f_airport_basic_data")
    List<FAirportBasicData> getAirportList();
}