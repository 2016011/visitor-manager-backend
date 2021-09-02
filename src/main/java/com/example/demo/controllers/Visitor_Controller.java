package com.example.demo.controllers;

import com.example.demo.models.Visitor;
import com.example.demo.repository.VisitorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// front-end communicating URLS when create users.

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")

public class Visitor_Controller {

    @Autowired
    VisitorRepository visitorRepository;

    //get the all of visitors
    @GetMapping("/visitors")
    public List <Visitor> getAllVisitor(){
        return visitorRepository.findAll();
    }

    //create visitor for add the new visitor
    @PostMapping("/visitors")
    public Visitor createVisitor(@RequestBody Visitor visitor) {
        return visitorRepository.save(visitor);
    }


}
