package com.fly.controller;

import com.fly.model.FAdmin;
import com.fly.model.FAdminRole;
import com.fly.service.RoleListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class RoleController {

    @Autowired
    private RoleListService roleListService;

    @RequestMapping("roleList")
    public String roleList(ModelMap map){

        List<FAdminRole> fAdminRoles = roleListService.roleList();

        map.addAttribute("roleList",fAdminRoles);
        return "user-group";
    }


    @RequestMapping("roleIdToUser")
    public String roleIdToUser(int id,String roles, HttpServletRequest req){

        List<FAdmin> fAdmins = roleListService.roleIdToUser(id);
        for (FAdmin fAdmin : fAdmins) {
            fAdmin.setRemark(roles);
        }
        req.setAttribute("fAdmins",fAdmins);
        return "user-group-list";
    }


}
