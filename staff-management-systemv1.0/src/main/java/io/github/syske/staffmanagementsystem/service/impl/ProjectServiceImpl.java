package io.github.syske.staffmanagementsystem.service.impl;

import io.github.syske.staffmanagementsystem.dao.ProjectDAO;
import io.github.syske.staffmanagementsystem.entity.Project;
import io.github.syske.staffmanagementsystem.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Resource
    private ProjectDAO projectDAO;

    @Override
    public List<Project> listProjects(Project project) {
        return projectDAO.listProjects(project);
    }

    @Override
    public boolean insertProject(Project project) {
        return projectDAO.insertProject(project) != 0;
    }

    @Override
    public boolean updateProject(Project project) {
        return projectDAO.updateProject(project) != 0;
    }

    @Override
    public boolean deleteProject(Project project) {
        return projectDAO.updateProject(project) != 0;
    }
}
