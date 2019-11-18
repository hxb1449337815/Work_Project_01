package com.xb.action;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.opensymphony.xwork2.ActionSupport;
import com.xb.mapper.UserMapper;
import com.xb.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.awt.print.Pageable;
import java.util.List;

public class TestAction extends ActionSupport {

    private List<User> list;

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    private Integer pageNum;
    private Integer pageSize;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String test(){
        if (pageNum==null){
            pageNum=1;
        }
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(getClass().getClassLoader().getResourceAsStream("mybatis_config.xml"));
        SqlSession session = factory.openSession();
        PageHelper.startPage(pageNum,5);
        UserMapper mapper = session.getMapper(UserMapper.class);
        list = mapper.select();


        return SUCCESS;
    }


}
