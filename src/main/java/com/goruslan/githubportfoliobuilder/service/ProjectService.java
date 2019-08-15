package com.goruslan.githubportfoliobuilder.service;


import com.goruslan.githubportfoliobuilder.models.Project;
import com.goruslan.githubportfoliobuilder.repositories.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {


    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository){ this.projectRepository = projectRepository; }

    public List<Project> findUserProjects(String username) {
        return projectRepository.findAllByCreatedBy(username);
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }


}
