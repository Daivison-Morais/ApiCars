package com.carsapi.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsapi.api.Repository.CarsRepository;
import com.carsapi.api.dto.CarsDto;
import com.carsapi.api.models.Cars;

@Service
public class CarService {

    @Autowired
    private CarsRepository repository;

    public List<Cars> findAll(){
        return repository.findAll();
    }

    public void create (Cars data){
        repository.save(data);
    }

    public void delete (Long id){
        repository.deleteById(id);
    }
    public void update (Long id, CarsDto data){
        repository.findById(id).map(c -> {
            c.setAnoModelo(data.anoModelo());
            c.setDataFabricacao(data.dataFabricacao());
            c.setFabricante(data.fabricante());
            c.setModelo(data.modelo());
            c.setValor(data.valor());
            return repository.save(c);
        });
    }

    
}
