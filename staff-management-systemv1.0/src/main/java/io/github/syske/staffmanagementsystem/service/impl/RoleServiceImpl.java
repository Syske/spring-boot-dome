package io.github.syske.staffmanagementsystem.service.impl;

import java.util.List;

import io.github.syske.staffmanagementsystem.dao.RoleDAO;
import io.github.syske.staffmanagementsystem.entity.Role;
import io.github.syske.staffmanagementsystem.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


@Service
public class RoleServiceImpl implements RoleService {

    @Resource
    private RoleDAO roleDAO;

    @Override
    public List<Role> listRoles() {

        return roleDAO.listRoles();
    }

    @Override
    public boolean updateRole(Role role) {

        return roleDAO.updateRole(role) != 0;
    }

    @Override
    public boolean deleteRole(Role role) {

        return roleDAO.updateRole(role) != 0;
    }

    @Override
    public boolean insertRole(Role role) {
        return roleDAO.insertRole(role) != 0;
    }

}
