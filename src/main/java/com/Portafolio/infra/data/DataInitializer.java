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
        project1.setName("PORTAFOLIO");
        project1.setDescription("REACT-API-JAVA-SQL");
        project1.setPicture("http://res.cloudinary.com/duufv4yfc/image/upload/v1695106494/sxjqlnyzppysmb09xbar.png");
        project1.setLink1("https://github.com/ViktorAntonyshyn/PORTAFOLIO");
        project1.setLink2("https://github.com/ViktorAntonyshyn/PORTAFOLIO_FRONT");

        Project project2 = new Project();
        project2.setName("Actores y actrices");
        project2.setDescription("API-VITE-REACT");
        project2.setPicture("https://getbootstrap.com/docs/5.3/assets/img/vite.svg");
        project2.setLink1("https://github.com/PasMosBus/Actores-y-actrices/tree/feature/VIKTOR");
        project2.setLink2(" ");

        Project project3 = new Project();
        project3.setName("AIP-TELEFONICO");
        project3.setDescription("REACT-API-JAVA-SQL");
        project3.setPicture("http://res.cloudinary.com/duufv4yfc/image/upload/v1695108004/n7wlsy3osdmk7e4er1sm.jpg");
        project3.setLink1("https://github.com/ViktorAntonyshyn/API_TELEFONICO");
        project3.setLink2("https://github.com/ViktorAntonyshyn/API_TELEFONICO");



        // Guardar los libros en la base de datos
        projectRepository.save(project1);
        projectRepository.save(project2);
        projectRepository.save(project3);

    }
}

