package com.xb.controller;

import com.xb.model.User;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


    @Autowired
    private UserService service;

    @RequestMapping("getUsers")
    public List<User> getUsers(){

        return service.getUsers();
    }

    @RequestMapping("insertUser")
    public int insertUser(){
        return service.insertUser("NH");
    }

    @RequestMapping("deleteUser")
    public int deleteUser(){
        return service.deleteUser(31);
    }


    @RequestMapping("updateUser")
    public int updateUser(){
        User cs = new User("CS");
        cs.setUid(33);
        return service.updateUser(cs);
    }



}
