package com.example.plantstest.controller;

import com.example.plantstest.models.Plant;
import com.example.plantstest.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlantController {


    @Autowired
    PlantRepository plantRepository;

    @GetMapping(value = "/plants")
    public ResponseEntity<List<Plant>> getAllPlants(){
        return new ResponseEntity<>(plantRepository.findAll(), HttpStatus.OK);
    }

    @PostMapping(value = "/plants")
    public ResponseEntity<Plant> postUser(@RequestBody Plant plant){
        plantRepository.save(plant);
        return new ResponseEntity<>(plant, HttpStatus.OK);
    }
}
