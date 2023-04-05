package com.carsapi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.Repository.CarsRepository;
import com.carsapi.api.dto.CarsDto;
import com.carsapi.api.models.Cars;

@RestController
@RequestMapping
public class CarsController {

    @Autowired
    private CarsRepository repository;

    @PostMapping
    public void create(@RequestBody CarsDto req){
        System.out.println(req.anoModelo());
        System.out.println(req.dataFabricacao());
        System.out.println(req.valor());
        System.out.println(req.modelo());
        System.out.println(req.fabricante());


        repository.save(new Cars(req));
    }
    
}
