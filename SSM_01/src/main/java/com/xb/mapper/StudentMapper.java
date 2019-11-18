package com.xb.mapper;

import com.xb.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentMapper {

    public List<Student> selectAll();

    public void addStudent(Student student);

    void deleteStudent(int id);

    void updateStudent(Student student);

}
