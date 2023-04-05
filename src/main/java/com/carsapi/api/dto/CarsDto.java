package com.carsapi.api.dto;

import java.util.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record CarsDto(
        @NotNull String modelo,

        @NotNull String fabricante,
        
        @Past Date dataFabricacao,

        @NotBlank double valor,

        @Past int anoModelo) {

}
