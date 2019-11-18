package com.fly.mapper;

import com.fly.model.FGateBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FGateBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FGateBasicData record);

    int insertSelective(FGateBasicData record);

    FGateBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FGateBasicData record);

    int updateByPrimaryKey(FGateBasicData record);

    @Select("select * from f_gate_basic_data")
    List<FGateBasicData> getGateList();
}