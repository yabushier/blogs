package com.yabushier.blogs.controller;

import com.yabushier.blogs.bean.Blogs;
import com.yabushier.blogs.service.BlogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BlogsDetailsController {

    @Autowired
    private BlogsService blogsService;

    @RequestMapping("/blogsDetails/{blogId}")
    public String blogsDetails(@PathVariable("blogId") Integer blogId, ModelMap modelMap) {
        Blogs blogs = blogsService.loadBlogsDetails(blogId);
        modelMap.addAttribute("blogs", blogs);
        return "blogsDetail";
    }
}
