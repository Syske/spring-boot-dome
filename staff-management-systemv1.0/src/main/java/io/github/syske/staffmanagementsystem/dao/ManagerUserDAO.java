package io.github.syske.staffmanagementsystem.dao;

import io.github.syske.staffmanagementsystem.entity.ManagerUser;

import java.util.List;

public interface ManagerUserDAO {

    /**
     * 查询管理员
     *
     * @param managerUser
     * @return
     */
    ManagerUser getManageruser(ManagerUser managerUser);

    /**
     * 查询管理员
     *
     * @param managerUser
     * @return
     */
    List<ManagerUser> lsitManagerUsers(ManagerUser managerUser);

    /**
     * 添加管理员
     *
     * @param managerUser
     * @return
     */
    ManagerUser insertManagerUser(ManagerUser managerUser);

    /**
     * 更新管理员
     *
     * @param managerUser
     * @return
     */
    int updateManagerUser(ManagerUser managerUser);

}
