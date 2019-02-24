package com.yabushier.blogs.bean;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Blogs implements Serializable {
    private Integer blogId;

    private String title;

    private String image;

    private Date releaseTime;

    private String userNickname;

    private Long pageviews;

    private String blogContent;

    private Integer classifyId;

    private Integer commentNum;

    private Integer istop;

    // 分类名称
    private String classifyName;
    // 该博客的标签，初始化长度：10
    private List<Tag> tagList;

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Blogs)) return false;
        Blogs blogs = (Blogs) o;
        return this.hashCode() == blogs.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(blogId, title, image, releaseTime, userNickname, pageviews, blogContent, classifyId, commentNum, istop);
    }

    public Integer getIstop() {
        return istop;
    }

    public void setIstop(Integer istop) {
        this.istop = istop;
    }

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname == null ? null : userNickname.trim();
    }

    public Long getPageviews() {
        return pageviews;
    }

    public void setPageviews(Long pageviews) {
        this.pageviews = pageviews;
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public Integer getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(Integer commentNum) {
        this.commentNum = commentNum;
    }
}