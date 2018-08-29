package com.yuxudong.blog.mapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BlogTypeMapper {
    /**
     * 获取全部博客类型
     * @return
     */
    public List<String> getAllBlogType();

    /**
     * 共有多少个博客类型
     */
    public Integer countBlogType();
}
