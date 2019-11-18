package com.fly.mapper;

import com.fly.model.FTaskBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FTaskBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FTaskBasicData record);

    int insertSelective(FTaskBasicData record);

    FTaskBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FTaskBasicData record);

    int updateByPrimaryKey(FTaskBasicData record);

    @Select("select * from f_task_basic_data")
    List<FTaskBasicData> getTaskList();
}