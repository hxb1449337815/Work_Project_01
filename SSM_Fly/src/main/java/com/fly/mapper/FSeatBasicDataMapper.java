package com.fly.mapper;

import com.fly.model.FSeatBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FSeatBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FSeatBasicData record);

    int insertSelective(FSeatBasicData record);

    FSeatBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FSeatBasicData record);

    int updateByPrimaryKey(FSeatBasicData record);

    @Select("select * from f_seat_basic_data")
    List<FSeatBasicData> getSeatList();
}