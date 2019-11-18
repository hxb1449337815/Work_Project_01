package com.fly.mapper;

import com.fly.model.FBackup;

public interface FBackupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FBackup record);

    int insertSelective(FBackup record);

    FBackup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FBackup record);

    int updateByPrimaryKey(FBackup record);
}