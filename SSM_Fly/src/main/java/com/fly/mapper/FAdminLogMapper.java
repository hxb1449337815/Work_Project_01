package com.fly.mapper;

import com.fly.model.FAdminLog;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FAdminLogMapper{
    int deleteByPrimaryKey(Integer id);

    int insert(FAdminLog record);

    int insertSelective(FAdminLog record);

    FAdminLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FAdminLog record);

    int updateByPrimaryKey(FAdminLog record);

    //页面基础数据的删除
    @Delete("delete from ${table_name} where id=${id}")
    int nqBasicData(@Param("id") int id,@Param("table_name") String name);

    //页面基础数据id查询
    @Select("select * from ${table_name} where id=${id}")
    List<Object> byId(@Param("id") int id, @Param("table_name") String name);

}