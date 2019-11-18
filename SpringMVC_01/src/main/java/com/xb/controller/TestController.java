package com.xb.controller;

import com.xb.mapper.UserMapper;
import com.xb.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    private SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(getClass().getClassLoader().getResourceAsStream("mybatis_config.xml"));

    private SqlSession session;

    void open(){
        session = factory.openSession();
    }

    void close(){
        session.commit();
        session.close();
    }




    @RequestMapping("test")
    public String test(HttpServletRequest req){
        System.out.println("成功");

        open();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> select = mapper.select();
        for (User user : select) {
            System.out.println(user);
        }

        req.setAttribute("list",select);


        return "index";
    }


    @RequestMapping("addUser")
    public String addUser(User u){
        System.out.println("你好");
        open();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int insert = mapper.insert(u);
        System.out.println(insert);
        return "index";
    }


    @RequestMapping("deleteUser")
    public String deleteUser(int uid){
        open();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.deleteByPrimaryKey(uid);
        System.out.println(i);
        close();
        return null;
    }


    @RequestMapping("byid")
    public String byid(int uid,HttpServletRequest req){
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(uid);
        req.setAttribute("user",user);
        return "update";
    }


    @RequestMapping("updateUser")
    public String updateUser(User user){
        open();
        UserMapper mapper = session.getMapper(UserMapper.class);
        int i = mapper.updateByPrimaryKey(user);
        close();
        System.out.println(i);
        return "";
    }


    @ResponseBody
    @RequestMapping("getJson")
    public Map<String,List> getJson(){
        Map<String,List> map=new HashMap<>();
        open();
        UserMapper mapper = session.getMapper(UserMapper.class);
        List<User> select = mapper.select();
        map.put("rows", select);
        return map;
    }




}
