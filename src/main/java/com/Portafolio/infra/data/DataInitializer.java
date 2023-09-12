package com.Portafolio.infra.data;

import com.Portafolio.domain.model.Project;
import com.Portafolio.infra.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public void run(String... args) throws Exception {
        // Crear instancias de libros y guardarlos en la base de datos
        Project project1 = new Project();
        project1.setName("Actores y actriz");
        project1.setDescription("JAVA");
        project1.setPicture("https://upload.wikimedia.org/wikipedia/uk/8/85/%D0%9B%D0%BE%D0%B3%D0%BE%D1%82%D0%B8%D0%BF_Java.png");
        project1.setLink1("https://getbootstrap.com");
        project1.setLink2("https://getbootstrap.com");

        Project project2 = new Project();
        project2.setName("Api-telefonico");
        project2.setDescription("VITE-REACT");
        project2.setPicture("https://getbootstrap.com/docs/5.3/assets/img/vite.svg");
        project2.setLink1("https://getbootstrap.com");
        project2.setLink2("https://getbootstrap.com");



        // Guardar los libros en la base de datos
        projectRepository.save(project1);
        projectRepository.save(project2);

    }
}

