package com.Portafolio.domain.service;

import com.Portafolio.domain.model.Project;
import com.Portafolio.infra.repositories.ProjectRepository;
import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;
    private final Cloudinary cloudinary;


    public ProjectService(ProjectRepository projectRepository, Cloudinary cloudinary) {
        this.projectRepository = projectRepository;
        this.cloudinary = cloudinary;
    }

    @Autowired



    public List<Project> getJob(){
        return projectRepository.findAll(); // SELECT * FROM project
    }

    public Project projectByIdById(Integer id){
        Optional<Project> projectById = projectRepository.findById(id);
        return projectById.orElse(null);
    }

    public void newJob(String name, String description, MultipartFile picture, String link1, String link2) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(picture.getBytes(), ObjectUtils.emptyMap());
        String pictureUrl = (String) uploadResult.get("url");

        Project project = new Project(name, description, pictureUrl, link1, link2);

        projectRepository.save(project);
    }

    public void updateJob(Integer id, String name, String description, MultipartFile picture, String link1, String link2) throws IOException {
        Project projectEncontrado = projectById(id);

        if (projectEncontrado != null) {
            Map uploadResult = cloudinary.uploader().upload(picture.getBytes(), ObjectUtils.emptyMap());
            String pictureUrl = (String) uploadResult.get("url");

            projectEncontrado.setName(name);
            projectEncontrado.setDescription(description);
            projectEncontrado.setPicture(pictureUrl);
            projectEncontrado.setLink1(link1);
            projectEncontrado.setLink2(link2);

            projectRepository.save(projectEncontrado);
        }
    }

    public void deleteJob(Integer id, Project project) {
        boolean existe = projectRepository.existsById(id);
        if (existe) {
            projectRepository.delete(project);
        }
    }

    public Project projectById(Integer id) {
        Optional<Project> projectById = (projectRepository.findById(id));
        return projectById.orElse(null);
    }
}
