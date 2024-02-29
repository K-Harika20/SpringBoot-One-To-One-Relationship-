package com.example.OneToOneRelationship.service;


import com.example.OneToOneRelationship.model.Project;
import com.example.OneToOneRelationship.repository.Projectrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class Projectservices {
    @Autowired
    private Projectrepository repo;
    public Project addproject(Project project){
        return repo.save(project);
    }


}
