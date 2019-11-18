package com.fly.mapper;

import com.fly.model.FRecBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FRecBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FRecBasicData record);

    int insertSelective(FRecBasicData record);

    FRecBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FRecBasicData record);

    int updateByPrimaryKey(FRecBasicData record);

    @Select("select * from f_rec_basic_data")
    List<FRecBasicData> getReclList();
}