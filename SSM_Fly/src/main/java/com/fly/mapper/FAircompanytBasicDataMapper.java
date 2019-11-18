package com.fly.mapper;

import com.fly.model.FAircompanytBasicData;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FAircompanytBasicDataMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FAircompanytBasicData record);

    int insertSelective(FAircompanytBasicData record);

    @Select("select * from f_aircompanyt_basic_data where id=${id}")
    FAircompanytBasicData selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(FAircompanytBasicData record);

    @Update("<script>update f_aircompanyt_basic_data set id=#{id}<if test='code!=null'>,code=#{code}</if><if test='enAbb!=null'>,enAbb=#{enAbb}</if><if test='name!=null'>,name=#{name}</if><if test='branchName!=null'>,branchName=#{branchName}</if><if test='twoCode!=null'>,twoCode=#{twoCode}</if><if test='threeCode!=null'>,threeCode=#{threeCode}</if><if test='attribute!=null'>,attribute=#{attribute}</if><if test='tel!=null'>,tel=#{tel}</if><if test='linkman!=null'>,linkman=#{linkman}</if><if test='linkmanPost!=null'>,linkmanPost=#{linkmanPost}</if><if test='firstTime!=null'>,firstTime=#{firstTime}</if><if test='email!=null'>,email=#{email}</if> where id=#{id}</script>")
    int updateByPrimaryKey(FAircompanytBasicData record);

    @Select("select * from f_aircompanyt_basic_data ")
    List<FAircompanytBasicData> getList();
}