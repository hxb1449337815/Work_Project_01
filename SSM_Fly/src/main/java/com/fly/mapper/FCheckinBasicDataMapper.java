package com.fly.mapper;

import com.fly.model.FCheckinBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FCheckinBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FCheckinBasicData record);

    int insertSelective(FCheckinBasicData record);

    FCheckinBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FCheckinBasicData record);

    int updateByPrimaryKey(FCheckinBasicData record);

    @Select("select * from f_checkin_basic_data")
    List<FCheckinBasicData> getCheckinList();
}