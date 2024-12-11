package com.example.springcrud.Ferwaba.service;

import com.example.springcrud.Ferwaba.Repository.FerwabaRepository;
import com.example.springcrud.Ferwaba.model.Teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ferwabaserviceImpl implements ferwabaservice{

@Autowired
private FerwabaRepository ferwabaRepository;

@Override
    public Teams saveTeams(Teams team){
    return ferwabaRepository.save(team);
}

    @Override
    public Teams saveteam(Teams team) {
        return ferwabaRepository.save(team);
    }
}
