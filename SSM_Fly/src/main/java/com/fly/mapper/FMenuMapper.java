package com.fly.mapper;

import com.fly.model.FMenu;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FMenu record);

    int insertSelective(FMenu record);

    FMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FMenu record);

    int updateByPrimaryKey(FMenu record);

    @Select("select * from role_menu r_m inner join f_menu m on r_m.menu_id=m.id where r_m.role_id=#{id}")
    List<FMenu> menuByRid(int id);
}