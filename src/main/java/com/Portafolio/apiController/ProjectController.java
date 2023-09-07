package com.Portafolio.apiController;

import com.Portafolio.domain.model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/projects")
public class ProjectController {
    @GetMapping
    public List<Project> getJob(){
        return List.of(
                new Project(
                        1,
                        "Mi project 1",
                        "Description",
                        null,
                        "http://ejemplo.com/1",
                        "http://ejemplo.com/2"
                )
        );
    }
}
