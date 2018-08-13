package io.github.syske.staffmanagementsystem.dao;

import io.github.syske.staffmanagementsystem.entity.Staff;

import java.util.List;

public interface StaffDAO {
    /**
     * 查询员工
     *
     * @param staff
     * @return
     */
    List<Staff> listStaffs(Staff staff);

    /**
     * 查询单个员工
     *
     * @param staff
     * @return
     */
    Staff getStaff(Staff staff);

    /**
     * 添加员工
     *
     * @param staff
     * @return
     */
    int insertStaff(Staff staff);

    /**
     * 更新员工
     *
     * @param staff
     * @return
     */
    int updateStaff(Staff staff);

}
