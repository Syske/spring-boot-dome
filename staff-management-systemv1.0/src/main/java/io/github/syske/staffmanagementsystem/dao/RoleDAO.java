package io.github.syske.staffmanagementsystem.dao;

import io.github.syske.staffmanagementsystem.entity.Role;

import java.util.List;


public interface RoleDAO {
    // 添加角色
    int insertRole(Role role);
    // 修改角色
    int updateRole(Role role);
    // 查询角色
    List<Role> listRoles();
    // 删除角色
    int deleteRole(String id);
}
