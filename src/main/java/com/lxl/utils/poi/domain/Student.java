package com.lxl.utils.poi.domain;

import java.util.Date;

/**
 * @auther lixinlong
 * @create 2018/5/18
 */
public class Student {

    Integer id;
    String name;
    String stuId;
    Date createDate;
    Date deleteDate;
    Integer status;

    public Student(Integer id, String name, String stuId, Date createDate, Date deleteDate, Integer status) {
        this.id = id;
        this.name = name;
        this.stuId = stuId;
        this.createDate = createDate;
        this.deleteDate = deleteDate;
        this.status = status;
    }

    public Student() {
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stuId='" + stuId + '\'' +
                ", createDate=" + createDate +
                ", deleteDate=" + deleteDate +
                ", status=" + status +
                '}';
    }
}