package com.yabushier.blogs.service.impl;

import com.yabushier.blogs.bean.Classify;
import com.yabushier.blogs.mapper.ClassifyMapper;
import com.yabushier.blogs.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    private ClassifyMapper classifyMapper;

    @Override
    public List<Classify> loadHeadMenu() {
        return classifyMapper.selectAll();
    }
}
