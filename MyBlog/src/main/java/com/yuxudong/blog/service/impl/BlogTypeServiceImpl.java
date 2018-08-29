package com.yuxudong.blog.service.impl;

import com.yuxudong.blog.mapper.BlogTypeMapper;
import com.yuxudong.blog.service.BlogTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogTypeServiceImpl implements BlogTypeService {
    @Autowired
    private BlogTypeMapper blogTypeMapper;

    @Override
    public List<String> getBlogTypeList(){
        return blogTypeMapper.getAllBlogType();
    }

    @Override
    public Integer countBlogTypeNum() {
        return blogTypeMapper.countBlogType();
    }
}
