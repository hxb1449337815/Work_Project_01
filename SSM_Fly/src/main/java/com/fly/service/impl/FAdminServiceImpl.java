package com.fly.service.impl;

import com.fly.mapper.FAdminMapper;
import com.fly.model.FAdmin;
import com.fly.service.FAdmimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FAdminServiceImpl")
public class FAdminServiceImpl implements FAdmimService {

    @Autowired
    private FAdminMapper fAdminMapper;


    @Override
    public FAdmin login(FAdmin user) {
        return fAdminMapper.login(user);
    }

    @Override
    public List<FAdmin> userList() {
        return fAdminMapper.userList();
    }

    @Override
    public int nqUser(FAdmin user) {
        return fAdminMapper.nqUser(user);
    }

    @Override
    public FAdmin selectByPrimaryKey(Integer id) {
        return fAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public int nqUpdateByPrimaryKey(FAdmin record) {
        return fAdminMapper.nqUpdateByPrimaryKey(record);
    }

    @Override
    public Integer getMaxId() {
        return fAdminMapper.getMaxId();
    }

    @Override
    public Integer nqUser_Role(Integer user_id, Integer role_id) {
        return fAdminMapper.addUser_Role(user_id,role_id);
    }


}
