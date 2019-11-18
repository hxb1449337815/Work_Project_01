package com.ssm.service.impl;

import com.ssm.mapper.StudentMapper;
import com.ssm.model.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }
}
