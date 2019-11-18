package com.xb.service;

import com.xb.model.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAll();

    public void addStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);


}
