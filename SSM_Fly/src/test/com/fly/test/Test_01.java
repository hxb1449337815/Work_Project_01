package com.fly.test;

import com.fly.mapper.FAdminMapper;
import com.fly.model.FAdmin;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;

public class Test_01 {


    @Test
    public void test(){

        SqlSession session = new SqlSessionFactoryBuilder().build(getClass().getClassLoader().getResourceAsStream("mybatis_config.xml")).openSession();
        FAdminMapper mapper = session.getMapper(FAdminMapper.class);
        FAdmin fAdmin = mapper.selectByPrimaryKey(1);
        System.out.println(fAdmin);

    }

}
