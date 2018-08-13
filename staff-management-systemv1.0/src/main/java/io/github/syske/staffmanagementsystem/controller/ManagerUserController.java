package io.github.syske.staffmanagementsystem.controller;

import io.github.syske.staffmanagementsystem.entity.ManagerUser;
import io.github.syske.staffmanagementsystem.service.ManagerUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/manager")
public class ManagerUserController {

    @Resource
    private ManagerUserService managerUserService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(ManagerUser managerUser, HttpSession session) {
        if(managerUserService.login(managerUser, session)) {
            return "true";
        }
        return "false";
    }
}
