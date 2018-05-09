package com.admin.api.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ApiInfo {
    private String id;

    private String name;

    private String url;

    private String type;

    private String descr;

    private String paramExam;

    private String paramExpl;

    private String resultExam;

    private String resultExpl;

    private String user;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public String getParamExam() {
        return paramExam;
    }

    public void setParamExam(String paramExam) {
        this.paramExam = paramExam == null ? null : paramExam.trim();
    }

    public String getParamExpl() {
        return paramExpl;
    }

    public void setParamExpl(String paramExpl) {
        this.paramExpl = paramExpl == null ? null : paramExpl.trim();
    }

    public String getResultExam() {
        return resultExam;
    }

    public void setResultExam(String resultExam) {
        this.resultExam = resultExam == null ? null : resultExam.trim();
    }

    public String getResultExpl() {
        return resultExpl;
    }

    public void setResultExpl(String resultExpl) {
        this.resultExpl = resultExpl == null ? null : resultExpl.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}