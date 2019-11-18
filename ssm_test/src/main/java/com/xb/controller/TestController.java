package com.xb.controller;

import com.xb.model.User;
import com.xb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class TestController {


    @Autowired
    private UserService userService;

    @RequestMapping("test")
    public String test(){
        System.out.println("ok");
        for (User user : userService.getUser()) {
            System.out.println(user);
        }

        return "index";
    }


}
