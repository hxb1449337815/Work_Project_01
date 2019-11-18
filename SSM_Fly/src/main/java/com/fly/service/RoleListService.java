package com.fly.service;

import com.fly.model.FAdmin;
import com.fly.model.FAdminRole;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoleListService {

    List<FAdminRole> roleList();
    public List<FAdmin> roleIdToUser(int id);

}
