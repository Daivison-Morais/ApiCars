package com.carsapi.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsapi.api.Repository.CarsRepository;
import com.carsapi.api.dto.CarsDto;
import com.carsapi.api.models.Cars;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/cars")
public class CarsController {

    @Autowired
    private CarsRepository repository;

    @GetMapping
    public List<Cars> listar() {
        return repository.findAll();
    }

    @PostMapping

    public void create(@RequestBody @Valid CarsDto req) {

        repository.save(new Cars(req));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updadte(@PathVariable Long id, @RequestBody @Valid CarsDto req) {
        repository.findById(id);
    }

}
