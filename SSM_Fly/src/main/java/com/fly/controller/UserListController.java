package com.fly.controller;

import com.alibaba.fastjson.JSONObject;
import com.fly.model.FAdmin;
import com.fly.service.FAdmimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
public class UserListController {

    @Autowired
    private FAdmimService fAdmimService;

    @RequestMapping("userList")
    public String userList(ModelMap map){
        List<FAdmin> userList=null;

        userList=fAdmimService.userList();

        map.addAttribute("users",userList);

        return "userlist";
    }


    @RequestMapping("addUser")
    public void addUser(FAdmin user,int roleid){
        int i = fAdmimService.nqUser(user);
        Integer maxId = fAdmimService.getMaxId();
        fAdmimService.nqUser_Role(maxId,roleid);
    }


    @RequestMapping("getUserById")
    public void getUserById(int id, HttpServletResponse resp){

        FAdmin fAdmin = fAdmimService.selectByPrimaryKey(id);

        JSONObject o = (JSONObject) JSONObject.toJSON(fAdmin);
        System.out.println(o);
        resp.setContentType("text/html;charset=utf-8");
        try {
            resp.getWriter().print(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @RequestMapping("updateUser")
    public void updateUser(FAdmin user){
        int i = fAdmimService.nqUpdateByPrimaryKey(user);
        System.out.println(i);
    }



}
