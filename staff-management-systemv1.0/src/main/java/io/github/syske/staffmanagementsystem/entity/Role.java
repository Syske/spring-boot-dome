package io.github.syske.staffmanagementsystem.entity;

import java.util.List;


public class Role {
    // 角色id
    private String id;
    // 角色名称
    private String name;
    // 角色描述
    private String descr;
    // 角色状态
    private String status;
    // 备注
    private String comments;
    // 用户列表
    private List<Staff> staffList;

    public Role() {
        super();
    }

    public Role(String id, String name, String descr, String status, String comments) {
        super();
        this.id = id;
        this.name = name;
        this.descr = descr;
        this.status = status;
        this.comments = comments;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}
