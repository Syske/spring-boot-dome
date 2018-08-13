package io.github.syske.staffmanagementsystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.github.syske.staffmanagementsystem.entity.Project;
import io.github.syske.staffmanagementsystem.service.ProjectService;
import io.github.syske.staffmanagementsystem.utils.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;

@Controller
@RequestMapping("/project")
public class ProjectController {

    @Resource
    private ProjectService projectService;

    @RequestMapping("/list")
    public String listProjects(Project project, Model model,
                               @RequestParam(required = true, defaultValue = "1") Integer page,
                               @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(page, pageSize);
        PageInfo<Project> pageInfo = new PageInfo<Project>(projectService.listProjects(project));
        model.addAttribute("pageInfo", pageInfo);
        return "/staff/projectList";
    }

    @RequestMapping("/add")
    @ResponseBody
    public String addProject(@RequestParam("projectFile") MultipartFile projectFile, Project project) throws Exception {

        System.out.println(projectFile);
        String fileName =  UUIDUtil.UUID() + projectFile.getOriginalFilename();
        System.out.println(fileName);
        String path = ResourceUtils.getFile("classpath:static/upload/").getPath();
        //String leftPath = session.getServletContext().getRealPath("/project_files");
        System.out.println(path);
        File file = new File(path, fileName);
        projectFile.transferTo(file);
        System.out.println(file);
        //static.upload
        project.setFiles(file.toString());
        if(projectService.insertProject(project)) {
            return "true";
        } else {
            return "false";
        }

    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestParam("projectFile") MultipartFile projectFile, Project project) throws Exception {
        String fileName =  UUIDUtil.UUID() + projectFile.getOriginalFilename();
        String path = ResourceUtils.getFile("classpath:static/upload/").getPath();
        File file = new File(path, fileName);
        projectFile.transferTo(file);
        project.setFiles(file.toString());
        if(projectService.updateProject(project)) {
            return "true";
        } else {
            return "false";
        }
    }
    @RequestMapping("/del")
    @ResponseBody
    public String delete(Project project, String status) {
        if(projectService.deleteProject(project)) {
            return "true";
        } else {
            return "false";
        }
    }
}
