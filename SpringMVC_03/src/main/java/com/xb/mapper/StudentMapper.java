package com.xb.mapper;

import com.xb.model.City;
import com.xb.model.Student;

import java.util.List;

public interface StudentMapper {

    List<Student> getStudents();

    Student getOneStudent(Integer id);

    City OneToOne(Integer city);

    List<City> getCities();

    void updateStudent(Student stu);
}
