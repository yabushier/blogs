package com.yabushier.blogs.mapper;

import com.yabushier.blogs.bean.Tag;
import java.util.List;

public interface TagMapper {
    int deleteByPrimaryKey(Integer tagId);

    int insert(Tag record);

    Tag selectByPrimaryKey(Integer tagId);

    List<Tag> selectAll();

    int updateByPrimaryKey(Tag record);

    List<Tag> selectTagsByBlogsId(Integer blogId);
}