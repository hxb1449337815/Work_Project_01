package com.fly.mapper;

import com.fly.model.FTerminalBasicData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FTerminalBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FTerminalBasicData record);

    int insertSelective(FTerminalBasicData record);

    FTerminalBasicData selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FTerminalBasicData record);

    int updateByPrimaryKey(FTerminalBasicData record);

    @Select("select * from f_terminal_basic_data")
    List<FTerminalBasicData> getTerminalList();
}