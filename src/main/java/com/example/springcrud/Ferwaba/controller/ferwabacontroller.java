package com.example.springcrud.Ferwaba.controller;

import com.example.springcrud.Ferwaba.model.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.springcrud.Ferwaba.service.ferwabaservice;

@RestController
@RequestMapping("/Teams")
public class ferwabacontroller {
    @Autowired
    private ferwabaservice ferwabaservice;
    @PostMapping("/add")
    public String add(@RequestBody Teams teams){
        ferwabaservice.saveteam(teams);
        return "New Student is added";
    }
}
