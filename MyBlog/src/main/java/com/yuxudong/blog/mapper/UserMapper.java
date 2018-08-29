package com.yuxudong.blog.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    public String getPassword(String username);
}
