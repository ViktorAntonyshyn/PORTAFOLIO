package com.Portafolio.domain.service;

import com.Portafolio.domain.model.Project;
import com.Portafolio.infra.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void newJob(Project project) {
        projectRepository.save(project);
    }

    public void updateJob(Integer id, Project project) {
        Optional<Project> jobById = (projectRepository.findById(id));

        if (jobById.isPresent()) {
            Project jobExistente = jobById.get();

            jobExistente.setName(project.getName());
            jobExistente.setDescription(project.getDescription());
            jobExistente.setPicture(project.getPicture());
            jobExistente.setLink1(project.getLink1());
            jobExistente.setLink2(project.getLink2());

            projectRepository.save(jobExistente);
        }
    }

    public void deleteJob(Integer id, Project project) {
        boolean existe = projectRepository.existsById(id);
        if (existe) {
            projectRepository.delete(project);
        }
    }
}
