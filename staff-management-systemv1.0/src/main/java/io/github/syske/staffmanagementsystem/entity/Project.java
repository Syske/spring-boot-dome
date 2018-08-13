package io.github.syske.staffmanagementsystem.entity;

public class Project {
    private String id;
    // 项目名
    private String name;
    // 开始时间
    private String startTime;
    // 结束时间
    private String endTime;
    // 项目预算
    private String budget;
    // 项目文件
    private String files;
    // 项目负责人
    private Staff staff;
    // 项目描述
    private String descr;
    // 项目地址
    private String location;

    private String status;

    public Project() {
    }

    public Project(String id, String name, String startTime, String endTime, String budget, String files, String descr, String location, String status) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.budget = budget;
        this.files = files;
        this.descr = descr;
        this.location = location;
        this.status = status;
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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
