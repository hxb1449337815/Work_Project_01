package com.fly.service.impl;

import com.fly.mapper.FAdminMapper;
import com.fly.mapper.FAdminRoleMapper;
import com.fly.model.FAdmin;
import com.fly.model.FAdminRole;
import com.fly.service.RoleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleListServiceImpl implements RoleListService {

    @Autowired
    private FAdminRoleMapper fAdminRoleMapper;

    @Autowired
    private FAdminMapper fAdminMapper;


    @Override
    public List<FAdminRole> roleList() {
        return fAdminRoleMapper.roleList();
    }

    @Override
    public List<FAdmin> roleIdToUser(int id) {
        return fAdminMapper.roleIdToUser(id);
    }
}
