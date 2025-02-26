package com.example.api_restful.controller;

import com.example.api_restful.model.Producto;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private List<Producto> productos = new ArrayList<>();

    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        productos.add(producto);
        return producto;
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productos;
    }

    @GetMapping("/{id}")
    public Producto obtenerProducto(@PathVariable String id) {
        return productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    @PutMapping("/{id}")
    public Producto actualizarProducto(@PathVariable String id, @RequestBody Producto producto) {
        Producto productoExistente = productos.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));

        productoExistente.setNombre(producto.getNombre());
        productoExistente.setPrecio(producto.getPrecio());

        return productoExistente;
    }

    @DeleteMapping("/{id}")
    public void eliminarProducto(@PathVariable String id) {
        productos.removeIf(p -> p.getId().equals(id));
    }
}