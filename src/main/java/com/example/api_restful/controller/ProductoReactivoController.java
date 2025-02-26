package com.example.api_restful.controller;

import com.example.api_restful.model.Dispositivo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/reactivo/dispositivos")
public class ProductoReactivoController {

    @GetMapping
    public Flux<Dispositivo> listarDispositivos() {
        return Flux.just(
                new Dispositivo("1", "Smartphone", "Samsung", 500.0),
                new Dispositivo("2", "Tablet", "Apple", 800.0),
                new Dispositivo("3", "Laptop", "Dell", 1200.0)
        );
    }
}