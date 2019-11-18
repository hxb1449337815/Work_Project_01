package com.fly.mapper;

import com.fly.model.FFlightRecord;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FFlightRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FFlightRecord record);

    int insertSelective(FFlightRecord record);

    @Select("select * from f_flight_record  where id=#{id}")
    FFlightRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FFlightRecord record);

    int updateByPrimaryKey(FFlightRecord record);

    @Select("select * from f_flight_record")
    @Results(
            @Result(property = "fabd",column = "no",one = @One(select = "com.fly.mapper.FAircraftBasicDataMapper.getByNo"))
    )
    List<FFlightRecord> query();

}