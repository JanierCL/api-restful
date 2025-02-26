package com.example.api_restful;


import com.example.api_restful.controller.ProductoReactivoController;
import com.example.api_restful.model.Dispositivo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
@AutoConfigureWebTestClient
public class ProductoReactivoControllerTest {

    @Autowired
    private ProductoReactivoController productoReactivoController;

    @Test
    public void testListarDispositivos() {
        // Obtener el Flux de dispositivos desde el controlador
        Flux<Dispositivo> dispositivos = productoReactivoController.listarDispositivos();

        // Verificar que el Flux emite los dispositivos esperados
        StepVerifier.create(dispositivos)
                .expectNextMatches(d -> d.getNombre().equals("Smartphone") && d.getMarca().equals("Samsung") && d.getPrecio() == 500.0)
                .expectNextMatches(d -> d.getNombre().equals("Tablet") && d.getMarca().equals("Apple") && d.getPrecio() == 800.0)
                .expectNextMatches(d -> d.getNombre().equals("Laptop") && d.getMarca().equals("Dell") && d.getPrecio() == 1200.0)
                .verifyComplete(); // Verifica que el Flux se complete correctamente
    }
}