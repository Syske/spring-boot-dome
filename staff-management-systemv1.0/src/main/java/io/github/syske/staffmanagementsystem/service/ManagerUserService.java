package io.github.syske.staffmanagementsystem.service;

import io.github.syske.staffmanagementsystem.entity.ManagerUser;

import javax.servlet.http.HttpSession;

public interface ManagerUserService {
    /**
     * 管理员登录
     *
     * @param managerUser
     * @param session
     * @return
     */
    boolean login(ManagerUser managerUser, HttpSession session);
}
