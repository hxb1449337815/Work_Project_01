package com.fly.mapper;

import com.fly.model.FChannelBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FChannelBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FChannelBasicData record);

    int insertSelective(FChannelBasicData record);

    FChannelBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FChannelBasicData record);

    int updateByPrimaryKey(FChannelBasicData record);

    @Select("select * from f_channel_basic_data")
    List<FChannelBasicData> getChannelList();
}