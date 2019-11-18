package com.fly.mapper;

import com.fly.model.FAdminRole;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FAdminRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FAdminRole record);

    int insertSelective(FAdminRole record);

    FAdminRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FAdminRole record);

    int updateByPrimaryKey(FAdminRole record);

    @Select("select r.* from user_role u_r inner join f_admin_role r on u_r.role_id=r.id where u_r.user_id=#{id}")
    @Results(
            @Result(property = "menus",column = "id",many = @Many(select = "com.fly.mapper.FMenuMapper.menuByRid"))
    )
    List<FAdminRole> rolesByUid(int id);


    @Select("select * from f_admin_role")
    List<FAdminRole> roleList();


}