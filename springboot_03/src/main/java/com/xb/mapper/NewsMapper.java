package com.xb.mapper;

import com.xb.model.News;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NewsMapper {

    @Select("select * from news")
    List<News> getNewsList();


}
