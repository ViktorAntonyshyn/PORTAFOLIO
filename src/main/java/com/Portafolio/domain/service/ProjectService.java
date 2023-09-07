package com.Portafolio.domain.service;

import com.Portafolio.domain.model.Project;
import com.Portafolio.infra.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Autowired



    public List<Project> getJob(){
        return projectRepository.findAll(); // SELECT * FROM project
    }

    public void newProject(Project project) {
        projectRepository.save(project);
    }
}
