package com.xb;

import com.xb.mapper.UserMapper;
import com.xb.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

public class test {

    @Test
    public void test1(){
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(this.getClass().getClassLoader().getResourceAsStream("mybatis_config.xml"));
        SqlSession session = factory.openSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(14);
        System.out.println(user.getUname());
    }

}
