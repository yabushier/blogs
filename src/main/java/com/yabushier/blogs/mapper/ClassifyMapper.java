package com.yabushier.blogs.mapper;

import com.yabushier.blogs.bean.Classify;
import java.util.List;

public interface ClassifyMapper {
    int deleteByPrimaryKey(Integer classifyId);

    int insert(Classify record);

    Classify selectByPrimaryKey(Integer classifyId);

    List<Classify> selectAll();

    int updateByPrimaryKey(Classify record);
}