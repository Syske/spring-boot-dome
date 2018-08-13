package io.github.syske.staffmanagementsystem.service;

import io.github.syske.staffmanagementsystem.entity.Role;

import java.util.List;


public interface RoleService {
    /**
     * 查询所有角色
     * 
     * @return
     */
    List<Role> listRoles();

    /**
     * 更新角色
     * 
     * @return
     */
    boolean updateRole(Role role);
    /**
     * 删除角色
     * 
     * @return
     */
    boolean deleteRole(Role role);

    /**
     * 插入角色
     *
     * @param role
     * @return
     */
    boolean insertRole(Role role);
}
