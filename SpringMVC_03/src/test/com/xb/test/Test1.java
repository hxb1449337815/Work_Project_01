package com.xb.test;

import com.xb.mapper.StudentMapper;
import com.xb.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;

public class Test1 {

    @Test
    public void test(){

        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(getClass().getClassLoader().getResourceAsStream("mybatis_config.xml"));
        SqlSession session = factory.openSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> students = mapper.getStudents();
        for (Student student : students) {
            System.out.println(student);
        }

    }



}
