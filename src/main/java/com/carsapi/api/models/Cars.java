package com.carsapi.api.models;

import java.util.Date;

import com.carsapi.api.dto.CarsDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor

public class Cars {

    public Cars(CarsDto req){
        this.anoModelo = req.anoModelo();
        this.dataFabricacao = req.dataFabricacao();
        this.valor = req.valor();
        this.modelo = req.modelo();
        this.fabricante = req.fabricante();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 60, nullable = false)
    private String modelo;

    @Column(length = 60, nullable = false)
    private String fabricante;

    @Column(nullable = false)
    private Date dataFabricacao;

    @Column(nullable = false)
    private double valor;

    @Column(nullable = false)
    private int anoModelo;

}
