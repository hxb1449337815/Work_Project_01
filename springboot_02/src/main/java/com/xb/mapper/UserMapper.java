package com.xb.mapper;


import com.xb.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Insert("insert into user values(null,#{uname})")
    public int insertUser(@Param("uname") String uname);

    @Delete("delete from user where uid=#{uid}")
    int deleteUser(int uid);

    @Update("update user set uname=#{uname} where uid=#{uid}")
    int updateUser(User user);


}
