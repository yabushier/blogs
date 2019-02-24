package com.yabushier.blogs.bean;

public class Classify {
    private Integer classifyId;

    private String classifyName;

    private Integer classifyPid;

    private Integer sort;

    public Integer getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(Integer classifyId) {
        this.classifyId = classifyId;
    }

    public String getClassifyName() {
        return classifyName;
    }

    public void setClassifyName(String classifyName) {
        this.classifyName = classifyName == null ? null : classifyName.trim();
    }

    public Integer getClassifyPid() {
        return classifyPid;
    }

    public void setClassifyPid(Integer classifyPid) {
        this.classifyPid = classifyPid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}