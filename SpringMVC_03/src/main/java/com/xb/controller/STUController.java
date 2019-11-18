package com.xb.controller;

import com.xb.mapper.StudentMapper;
import com.xb.model.City;
import com.xb.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class STUController {

    private SqlSession session=new SqlSessionFactoryBuilder().build(getClass().getClassLoader().getResourceAsStream("mybatis_config.xml")).openSession();

    @RequestMapping("getStudents")
    public String getStudents(ModelMap map){
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        map.addAttribute("students",students);
        System.out.println(students);

        return "index";
    }


    @RequestMapping("updateStudent")
    public String updateStudent(int id,ModelMap map){
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        Student oneStudent = mapper.getOneStudent(id);
        List<City> cities = mapper.getCities();
        map.addAttribute("stu",oneStudent);
        map.addAttribute("cities",cities);
        return "update";
    }


    @RequestMapping("toUpdateStudent")
    public String toUpdateStudent(Student stu){
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        mapper.updateStudent(stu);
        session.commit();
        return "redirect:/getStudents.action";
    }



}
