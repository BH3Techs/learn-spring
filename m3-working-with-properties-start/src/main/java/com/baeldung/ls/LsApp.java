package com.baeldung.ls;

import javax.annotation.PostConstruct;

import com.baeldung.ls.persistence.model.Project;
import com.baeldung.ls.service.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class LsApp {

    public static void main(final String... args) {
        SpringApplication.run(LsApp.class, args);
    }
    @Autowired
    IProjectService projectService;
    @PostConstruct
    public void postConstruct() {
        Project project = new Project("My First Project", LocalDate.now());
        projectService.save(project);
    }

}
