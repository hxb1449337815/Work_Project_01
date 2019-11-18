package com.xb.service.impl;

import com.xb.mapper.NewsMapper;
import com.xb.model.News;
import com.xb.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper mapper;


    @Override
    public List<News> getNewsList() {
        return mapper.getNewsList();
    }
}
