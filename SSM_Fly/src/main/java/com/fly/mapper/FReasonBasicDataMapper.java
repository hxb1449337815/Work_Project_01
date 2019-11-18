package com.fly.mapper;

import com.fly.model.FReasonBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FReasonBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FReasonBasicData record);

    int insertSelective(FReasonBasicData record);

    FReasonBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FReasonBasicData record);

    int updateByPrimaryKey(FReasonBasicData record);

    @Select("select * from f_reason_basic_data")
    List<FReasonBasicData> getReasonList();
}