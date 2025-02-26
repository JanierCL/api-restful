package com.example.api_restful.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dispositivo {
    private String id;
    private String nombre;
    private String marca;
    private double precio;
}