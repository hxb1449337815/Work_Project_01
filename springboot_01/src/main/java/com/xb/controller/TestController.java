package com.xb.controller;


import com.xb.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//@Controller
public class TestController {

    @RequestMapping("test")
    public Map<String,String> test(){
        Map<String,String> map=new HashMap<>();
        map.put("长沙","CSX");
        map.put("北京","BJS");

        return map;
    }

    @RequestMapping("stringData")
    public String stringData(){
        System.out.println("你好呀");

        return "json";
    }


    @RequestMapping("mapJson")
    public Map<String,Object> mapJson(){
        Map<String,Object> map=new HashMap<>();
        List<User> rows=new ArrayList<>();
        rows.add(new User("admin",10));
        rows.add(new User("sa",12));
        map.put("tole",10);
        map.put("rows",rows);
        return map;
    }


}
