package com.xb.controller;

import com.xb.model.Student;
import com.xb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("test")
    public String test(){
        System.out.println("ok");
        return "index";
    }

    @Autowired
    private StudentService studentService;


    @RequestMapping("selectAll")
    public String selectAll(){

        for (Student s : studentService.selectAll()) {
            System.out.println(s);
        }

        return "index";
    }

    @RequestMapping("addStudent")
    public String addStudent(){
        Student s=new Student("hxb",123);
        studentService.addStudent(s);
        return "index";
    }

    @RequestMapping("deleteStudent")
    public String deleteStudent(){

        studentService.deleteStudent(24);

        return "index";
    }

    @RequestMapping("updateStudent")
    public String updateStudent(){
        Student s=new Student("hxb",123);
        s.setId(23);
        studentService.updateStudent(s);

        return "index";
    }



}
