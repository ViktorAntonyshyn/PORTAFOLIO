package com.Portafolio.apiController;

import com.Portafolio.domain.model.Project;
import com.Portafolio.domain.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5174")
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
    public void create(@RequestBody Project project){
         projectService.newJob(project);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id, @RequestBody Project project){
        projectService.updateJob(id, project);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id, Project project){
        projectService.deleteJob(id, project);
    }
}
