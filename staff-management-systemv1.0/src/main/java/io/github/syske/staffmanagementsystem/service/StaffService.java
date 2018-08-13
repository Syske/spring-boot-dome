package io.github.syske.staffmanagementsystem.service;

import io.github.syske.staffmanagementsystem.dao.StaffDAO;
import io.github.syske.staffmanagementsystem.entity.Staff;

import javax.annotation.Resource;
import java.util.List;

public interface StaffService {

    List<Staff> listStaffs(Staff staff);

    boolean insertStaff(Staff staff);

    boolean updateStaff(Staff staff);

    boolean deleteStaff(Staff staff);
}
