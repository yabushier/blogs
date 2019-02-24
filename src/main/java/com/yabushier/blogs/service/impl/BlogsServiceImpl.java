package com.yabushier.blogs.service.impl;

import com.github.pagehelper.PageHelper;
import com.yabushier.blogs.bean.Blogs;
import com.yabushier.blogs.mapper.BlogsMapper;
import com.yabushier.blogs.mapper.TagMapper;
import com.yabushier.blogs.service.BlogsService;
import com.youbenzi.mdtool.tool.MDTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class BlogsServiceImpl implements BlogsService {

    @Autowired
    private BlogsMapper blogsMapper;

    @Autowired
    private TagMapper tagMapper;

    /**
     * 分页查询，加载博客信息
     * @param pageNum
     * @return
     */
    @Override
    public HashSet<Blogs> loadBlogs(Integer pageNum) {
        PageHelper.startPage(pageNum,6);
        HashSet<Blogs> blogs = new HashSet<>();
        // 加载普通博客
        blogs.addAll(blogsMapper.selectAll());
        // 加载顶置博客
        blogs.add(blogsMapper.selectTopBlogs());
        // 加载博客标签
        for (Blogs blog : blogs) {
            //根据博客id加载该博客的所有标签
            blog.setTagList(tagMapper.selectTagsByBlogsId(blog.getBlogId()));
        }
        return blogs;
    }

    @Override
    public Blogs loadBlogsDetails(Integer blogId) {
        Blogs blogs = blogsMapper.selectByPrimaryKey(blogId);
        // 添加该bolgs的标签
        blogs.setTagList(tagMapper.selectTagsByBlogsId(blogId));
        // 格式化Markdown格式
        blogs.setBlogContent(MDTool.markdown2Html(blogs.getBlogContent()));
        return blogs;
    }

    @Override
    public HashSet<Blogs> loadBlogsByClassifyPid(Integer pageNum, Integer classifyPid) {
        PageHelper.startPage(pageNum,6);
        List<Blogs> blogsList = blogsMapper.loadBlogsByClassifyPid(classifyPid);
        return new HashSet<Blogs>(blogsList);
    }

}
