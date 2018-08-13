package io.github.syske.staffmanagementsystem.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.github.syske.staffmanagementsystem.entity.Role;
import io.github.syske.staffmanagementsystem.entity.Staff;
import io.github.syske.staffmanagementsystem.service.StaffService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @Resource
    private StaffService staffService;

    @RequestMapping("/listStaffs")
    public String listStaffs(Staff staff, Model model,
                             @RequestParam(required = true, defaultValue = "1") Integer page,
                             @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        PageInfo<Staff> pageInfo = new PageInfo<Staff>(
                staffService.listStaffs(staff));
        model.addAttribute("pageInfo", pageInfo);
        return "/staff/staffList";
    }

    @RequestMapping("/listStaffs2")
    public String listStaffs2(Staff staff, Model model) {
        model.addAttribute("pageInfo", staffService.listStaffs(staff));
        return "/staff/table-data-table";
    }

    @RequestMapping("/lists")
    @ResponseBody
    public String listStaffs() {
        return JSON.toJSONString(staffService.listStaffs(null));
    }

    @RequestMapping("/add")
    @ResponseBody
    public String insertStaff(Staff staff, String position) {
        Role role = new Role();
        role.setId(position);
        staff.setRole(role);
        if (staffService.insertStaff(staff))
            return "true";
        return "false";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String updateStaff(Staff staff, String position) {
        Role role = new Role();
        role.setId(position);
        staff.setRole(role);
        if (staffService.updateStaff(staff))
            return "true";
        return "false";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String deleteStaff(Staff staff) {
        if (staffService.deleteStaff(staff))
            return "true";
        return "false";
    }

}
