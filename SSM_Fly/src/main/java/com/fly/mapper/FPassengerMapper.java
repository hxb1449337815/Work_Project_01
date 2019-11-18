package com.fly.mapper;

import com.fly.model.FPassenger;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FPassengerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FPassenger record);

    int insertSelective(FPassenger record);

    FPassenger selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FPassenger record);

    int updateByPrimaryKey(FPassenger record);

    @Select("select * from f_passenger")
    List<FPassenger> getPassengerList();
}