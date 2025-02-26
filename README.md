# API RESTful con Spring Boot

Este proyecto es una API RESTful realizada con Spring Boot 3+ que contiene varios ejercicios prácticos para evaluar el conocimiento básico en el desarrollo de APIs RESTful.

# Ejercicios Implementados

1. Endpoint Simple: Un endpoint que devuelve un saludo.
2. CRUD Básico de Productos: Implementación de un CRUD para manejar productos.
3. Internacionalización (i18n): Modificación del endpoint de saludo para soportar múltiples idiomas, español e inglés en este caso.
4. Endpoint Reactivo con WebFlux: Implementación de un endpoint reactivo para listar productos.
5. Pruebas con StepVerifier: Pruebas unitarias para validar el endpoint reactivo de productos.

# Requisitos Previos
- Java 17 o superior.
- Maven instalado.
- Postman o cualquier cliente HTTP para probar los endpoints.

# Instrucciones para Ejecutar la API
1. Clonar el Repositorio:
   bash
   git clone https://github.com/JanierCL/api-restful.git

Compilar y Ejecutar la Aplicación:

Copy
mvn clean install
mvn spring-boot:run
Probar los Endpoints:

1. Endpoint Simple:

URL: GET http://localhost:8080/api/saludo
Salida Esperada: "¡Hola, API RESTful!"

2. CRUD de Productos:

a) Agregar Producto: POST http://localhost:8080/api/productos
Body (JSON):
json
Copy
{
  "id": "1",
  "nombre": "Laptop",
  "precio": 1200.0
}

b) Listar Productos: GET http://localhost:8080/api/productos

c) Obtener Producto por ID: GET http://localhost:8080/api/productos/{id}

d) Actualizar Producto: PUT http://localhost:8080/api/productos/{id}

e) Eliminar Producto: DELETE http://localhost:8080/api/productos/{id}

3. Internacionalización:

URL: GET http://localhost:8080/api/saludo?lang=es
Salida Esperada: "¡Hola, API RESTful en Español!"

URL: GET http://localhost:8080/api/saludo?lang=en
Salida Esperada: "Hello, RESTful API in English!"

4. Endpoint Reactivo:
URL: GET http://localhost:8080/api/productos
Salida Esperada: JSON con los productos en formato reactivo.

5. Ejecutar Pruebas Unitarias:

mvn test

#Estructura del Proyecto

src/main/java: Código fuente de la aplicación.
	controller: Controladores REST.
	model: Modelos de datos.

src/test/java: Pruebas unitarias.
src/main/resources: Archivos de configuración y mensajes de internacionalización.
