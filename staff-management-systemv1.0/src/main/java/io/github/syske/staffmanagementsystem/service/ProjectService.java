package io.github.syske.staffmanagementsystem.service;

import io.github.syske.staffmanagementsystem.entity.Project;

import java.util.List;

public interface ProjectService {

    List<Project> listProjects(Project project);

    boolean insertProject(Project project);

    boolean updateProject(Project project);

    boolean deleteProject(Project project);
}
