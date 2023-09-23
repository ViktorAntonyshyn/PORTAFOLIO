package com.Portafolio.apiController;

import com.Portafolio.domain.model.Project;
import com.Portafolio.domain.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:5173")

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
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectPorId(@PathVariable Integer id) {
        // Lógica para obtener el project por ID y devolverla en la respuesta ResponseEntity
        Project project = projectService.projectById(id);
        if (project != null ) {
            return ResponseEntity.ok(project);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public void create(@RequestParam String name,
                       @RequestParam String description,
                       @RequestParam MultipartFile picture,
                       @RequestParam String link1,
                       @RequestParam String link2
                       ) throws IOException {
         projectService.newJob(name, description, picture, link1, link2);
    }
    @PutMapping("/{id}")
    public void update(@PathVariable Integer id,
                       @RequestParam String name,
                       @RequestParam String description,
                       @RequestParam MultipartFile picture,
                       @RequestParam String link1,
                       @RequestParam String link2) throws IOException {
        projectService.updateJob(id, name, description, picture, link1,link2);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id, Project project){
        projectService.deleteJob(id, project);
    }
}
