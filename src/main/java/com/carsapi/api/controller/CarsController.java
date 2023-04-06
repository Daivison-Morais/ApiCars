package com.carsapi.api.controller;

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

import com.carsapi.api.dto.CarsDto;
import com.carsapi.api.models.Cars;
import com.carsapi.api.service.CarService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("api/cars")
public class CarsController {

    @Autowired
    private CarService service;

    @GetMapping
    public List<Cars> getall() {
        return service.findAll();
    }

    @PostMapping
    public void create(@RequestBody @Valid CarsDto req) {

        service.create(new Cars(req));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public void updadte(@PathVariable Long id, @RequestBody @Valid CarsDto req) {
        service.update(id, req);
    }

}
