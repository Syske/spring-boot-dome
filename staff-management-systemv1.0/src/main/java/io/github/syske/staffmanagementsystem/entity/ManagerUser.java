package io.github.syske.staffmanagementsystem.entity;

public class ManagerUser {
    private String id;
    // 用户名
    private String userName;
    // 密码
    private String password;
    // 账户状态,1-启用，0- 禁用
    private String status;


    public ManagerUser() {
        super();
    }

    public ManagerUser(String id, String userName, String password, String stuats) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
