package com.fly.service;

import com.fly.model.FAdmin;

import java.util.List;

public interface FAdmimService {

    FAdmin login(FAdmin user);

    List<FAdmin> userList();

    int nqUser(FAdmin user);

    FAdmin selectByPrimaryKey(Integer id);

    int nqUpdateByPrimaryKey(FAdmin record);

    Integer getMaxId();

    Integer nqUser_Role(Integer user_id,Integer role_id);

}
