package io.github.syske.staffmanagementsystem.dao;

import io.github.syske.staffmanagementsystem.entity.Project;

import java.util.List;

public interface ProjectDAO {
    /**
     * 查询员工
     *
     * @param project
     * @return
     */
    List<Project> listProjects(Project project);

    /**
     * 查询单个员工
     *
     * @param project
     * @return
     */
    Project getProject(Project project);

    /**
     * 添加员工
     *
     * @param project
     * @return
     */
    int insertProject(Project project);

    /**
     * 更新员工
     *
     * @param project
     * @return
     */
    int updateProject(Project project);

}
