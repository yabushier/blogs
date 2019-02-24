package com.yabushier.blogs.mapper;

import com.yabushier.blogs.bean.Blogs;
import java.util.List;

public interface BlogsMapper {
    int deleteByPrimaryKey(Integer blogId);

    int insert(Blogs record);

    Blogs selectByPrimaryKey(Integer blogId);

    List<Blogs> selectAll();

    int updateByPrimaryKey(Blogs record);

    Blogs selectTopBlogs();

    List<Blogs> loadBlogsByClassifyPid(Integer classifyPid);
}