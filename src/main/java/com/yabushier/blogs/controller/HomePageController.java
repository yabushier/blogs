package com.yabushier.blogs.controller;

import com.yabushier.blogs.bean.Blogs;
import com.yabushier.blogs.bean.Classify;
import com.yabushier.blogs.service.BlogsService;
import com.yabushier.blogs.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashSet;
import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    private ClassifyService classifyService;
    @Autowired
    private BlogsService blogsService;

    /**
     * 加载homePage页面
     * @param modelMap
     * @return
     */
    @RequestMapping("/")
    public String index(ModelMap modelMap) {
        // 加载菜单分类
        List<Classify> classifyList = classifyService.loadHeadMenu();
        modelMap.addAttribute("classifyList", classifyList);
        // 加载广告位

        return "homePage";
    }

    @RequestMapping("/loadBlogs/{pageNum}")
    @ResponseBody
    public HashSet<Blogs> loadBlogs(@PathVariable("pageNum") Integer pageNum) {
        HashSet<Blogs> blogsList = blogsService.loadBlogs(pageNum);
        return blogsList;
    }

    @RequestMapping("/menu_href/{classifyPid}")
    @ResponseBody
    public HashSet<Blogs> changeMenu(@PathVariable(value = "pageNum",required = false) Integer pageNum, @PathVariable("classifyPid") Integer classifyPid){
        HashSet<Blogs> blogsHashSet = blogsService.loadBlogsByClassifyPid(pageNum==null?1:pageNum,classifyPid);
        return blogsHashSet;
    }

}
