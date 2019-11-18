package com.fly.mapper;

import com.fly.model.FAircraftBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FAircraftBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FAircraftBasicData record);

    int insertSelective(FAircraftBasicData record);

    FAircraftBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FAircraftBasicData record);

    int updateByPrimaryKey(FAircraftBasicData record);

    @Select("select * from f_aircraft_basic_data where no=#{no}")
    public FAircraftBasicData getByNo(String no);

    @Select("select * from f_aircraft_basic_data")
    List<FAircraftBasicData> getList();


}