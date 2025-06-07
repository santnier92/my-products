//Funcion, publicar servicios RES

package com.devsenior.santnier.products_backend.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devsenior.santnier.products_backend.model.Product;
import com.devsenior.santnier.products_backend.repository.ProductRepository;

@RestController
public class ProductController {

    // variable privada para la clase controlador que necesitan este repositorio
    @Autowired // buca objeto de este tipo y lo guarda en productRepository
    private ProductRepository productRepository;

    @GetMapping("/")
    public Map<String, Object> seyHello() {
        return Map.of("message", "Hello, World!", "age", "15");
    }

    // Peticion GET (pedir datos) en esta ruta, llamar al endpoint getAllProducts
    @GetMapping("api/products")

    // funcion de lista llamada getAllProducts y retornamos valores
    public List<Product> getAllProducts() { // Product es la clase que creamos

        // returne del productRepository todos los productos
        return productRepository.findAll();
    }

    // Creamos un metodo createProduct y recibe los datos de product
    @PostMapping("api/products")
    public Product createProduct(@RequestBody Product product) {

        var newProduct = productRepository.save(product);
        return newProduct;
    }

}
