package com.Portafolio.domain.service;

import com.Portafolio.domain.model.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
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
