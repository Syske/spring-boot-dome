package io.github.syske.staffmanagementsystem.service.impl;

import io.github.syske.staffmanagementsystem.dao.ManagerUserDAO;
import io.github.syske.staffmanagementsystem.entity.ManagerUser;
import io.github.syske.staffmanagementsystem.service.ManagerUserService;
import io.github.syske.staffmanagementsystem.utils.MD5Util;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
public class ManagerUserServiceImpl implements ManagerUserService {

    @Resource
    private ManagerUserDAO managerUserDAO;

    @Override
    public boolean login(ManagerUser managerUser, HttpSession session) {
        ManagerUser managerUserInner = managerUserDAO.getManageruser(managerUser);
        if(managerUserInner != null) {
                return managerUserInner.getPassword().equals(MD5Util.encrypt(managerUser.getPassword()));
            }
        return false;
    }
}
