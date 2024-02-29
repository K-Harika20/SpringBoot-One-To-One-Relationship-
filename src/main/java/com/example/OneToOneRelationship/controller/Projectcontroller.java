package com.example.OneToOneRelationship.controller;



import com.example.OneToOneRelationship.model.Project;
import com.example.OneToOneRelationship.service.Projectservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class Projectcontroller {
    @Autowired
    private Projectservices projectservice;

    @PostMapping("/add")
    public Project addproject(@RequestBody Project project){
        return projectservice.addproject(project);
    }
}
