package com.xb.service.impl;

import com.xb.mapper.UserMapper;
import com.xb.model.User;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public List<User> getUsers() {
        return mapper.getUsers();
    }

    @Override
    public int insertUser(String uname) {
        return mapper.insertUser(uname);
    }

    @Override
    public int deleteUser(int uid) {
        return mapper.deleteUser(uid);
    }

    @Override
    public int updateUser(User user) {
        return mapper.updateUser(user);
    }


}
