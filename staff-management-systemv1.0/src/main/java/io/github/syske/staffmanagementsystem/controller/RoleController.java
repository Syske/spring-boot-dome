package io.github.syske.staffmanagementsystem.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.github.syske.staffmanagementsystem.entity.Role;
import io.github.syske.staffmanagementsystem.service.RoleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Resource
    private RoleService roleService;

    @RequestMapping("/list")
    public String list(Model model,
                             @RequestParam(required = false, defaultValue = "1") Integer page,
                             @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        PageInfo<Role> rolePageInfo = new PageInfo<Role>(
                roleService.listRoles());
        model.addAttribute("pageInfo", rolePageInfo);
        return "/staff/roleList";
    }


    @RequestMapping("/lista")
    @ResponseBody
    public String listAll() {
        return JSON.toJSONString(roleService.listRoles());
    }

    @RequestMapping("/add")
    @ResponseBody
    public String add(Role role) {
        if (roleService.insertRole(role)) {
            return "true";
        }
        return "false";
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(Role role) {
        if (roleService.updateRole(role)) {
            return "true";
        }
        return "false";
    }

    @RequestMapping("/del")
    @ResponseBody
    public String del(Role role) {
        if (roleService.deleteRole(role)){
            return "true";
        }
        return "false";
    }
}
