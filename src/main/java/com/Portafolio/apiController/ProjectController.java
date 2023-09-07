package com.Portafolio.apiController;

import com.Portafolio.domain.model.Project;
import com.Portafolio.domain.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/projects")
public class ProjectController {
    private final ProjectService projectService;
    @Autowired

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getJobController(){
        return projectService.getJob();
    }
    @PostMapping
    public void createJob(@RequestBody Project project){
         projectService.newProject(project);
    }
}
