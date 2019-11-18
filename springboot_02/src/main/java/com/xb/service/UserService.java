package com.xb.service;

import com.xb.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    List<User> getUsers();
    int insertUser(String uname);
    int deleteUser(int uid);
    int updateUser(User user);

}
