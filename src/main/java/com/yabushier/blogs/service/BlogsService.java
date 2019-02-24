package com.yabushier.blogs.service;

import com.yabushier.blogs.bean.Blogs;

import java.util.HashSet;

public interface BlogsService {
    HashSet<Blogs> loadBlogs(Integer pageNum);

    Blogs loadBlogsDetails(Integer blogId);

    HashSet<Blogs> loadBlogsByClassifyPid(Integer pageNum ,Integer classifyPid);
}
