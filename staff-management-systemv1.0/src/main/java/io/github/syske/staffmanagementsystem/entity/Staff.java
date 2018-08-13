package io.github.syske.staffmanagementsystem.entity;

public class Staff {
    // 用户id
    private String id;
    // 员工姓名
    private String name;
    // 员工年龄
    private String age;
    // 员工性别
    private String sex;
    // 员工地址
    private String address;
    // 员工联系电话
    private String phoneNum;
    // 员工户籍
    private String censusRegister;
    // 员工职位
    private Role role;
    // 员工备注
    private String comments;
    // 员工状态,1-在职，0-离职
    private String status;

    public Staff() {
        super();
    }

    public Staff(String id, String name, String age, String sex, String address, String phoneNum, String censusRegister, String comments, String status) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
        this.phoneNum = phoneNum;
        this.censusRegister = censusRegister;
        this.comments = comments;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCensusRegister() {
        return censusRegister;
    }

    public void setCensusRegister(String censusRegister) {
        this.censusRegister = censusRegister;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", censusRegister='" + censusRegister + '\'' +
                ", role='" + role + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
