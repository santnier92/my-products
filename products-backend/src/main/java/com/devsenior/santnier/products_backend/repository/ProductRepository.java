package com.devsenior.santnier.products_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsenior.santnier.products_backend.model.Product;

//interfaz, clase de java que no tiene atributos y metodos implementados
// Definición de las Funciones que vamos a trabajar
public interface ProductRepository extends JpaRepository<Product, Long> { //Metodo que manipula la BD
    
}
