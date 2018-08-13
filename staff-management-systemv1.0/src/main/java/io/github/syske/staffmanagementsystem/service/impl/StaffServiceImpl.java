package io.github.syske.staffmanagementsystem.service.impl;

import io.github.syske.staffmanagementsystem.dao.StaffDAO;
import io.github.syske.staffmanagementsystem.entity.Staff;
import io.github.syske.staffmanagementsystem.service.StaffService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffDAO staffDAO;

    @Override
    public boolean updateStaff(Staff staff) {
        return staffDAO.updateStaff(staff) != 0;
    }

    @Override
    public boolean deleteStaff(Staff staff) {
        staff.setStatus("0");
        return staffDAO.updateStaff(staff) != 0;
    }

    @Override
    public boolean insertStaff(Staff staff) {
        return staffDAO.insertStaff(staff) != 0;
    }

    @Override
    public List<Staff> listStaffs(Staff staff) {

        return staffDAO.listStaffs(staff);
    }
}
