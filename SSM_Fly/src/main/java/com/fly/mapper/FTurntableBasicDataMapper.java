package com.fly.mapper;

import com.fly.model.FTurntableBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FTurntableBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FTurntableBasicData record);

    int insertSelective(FTurntableBasicData record);

    FTurntableBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FTurntableBasicData record);

    int updateByPrimaryKey(FTurntableBasicData record);

    @Select("select * from f_turntable_basic_data")
    List<FTurntableBasicData> getTurntableList();
}