package com.fly.mapper;

import com.fly.model.FAdmin;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import javax.xml.stream.FactoryConfigurationError;
import java.util.List;

@Service
public interface FAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FAdmin record);

    int insertSelective(FAdmin record);

    @Select("select * from f_admin where id=#{id}")
    FAdmin selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FAdmin record);

    @Update("update f_admin set username=#{username},name=#{name},post=#{post},qq=#{qq},age=#{age},password=#{password},sex=#{sex},tel=#{tel} where id=#{id}")
    int nqUpdateByPrimaryKey(FAdmin record);

    @Select("select * from f_admin where username=#{username} and password=#{password}")
    @Results(
            @Result(property = "roles",column = "id", many=@Many(select = "com.fly.mapper.FAdminRoleMapper.rolesByUid"))
    )
    FAdmin login(FAdmin user);

    @Select("select * from f_admin")
    List<FAdmin> userList();

    @Insert("insert into f_admin(username,name,post,qq,age,password,sex,tel) values(#{username},#{name},#{post},#{qq},#{age},#{password},#{sex},#{tel})")
    int nqUser(FAdmin user);

    @Select("select * from f_admin where roleid=#{id}")
    public List<FAdmin> roleIdToUser(int id);


    @Select("select max(id) from f_admin")
    Integer getMaxId();

    @Insert("insert into user_role values(null,#{user_id},#{role_id})")
    Integer addUser_Role(Integer user_id,Integer role_id);

}