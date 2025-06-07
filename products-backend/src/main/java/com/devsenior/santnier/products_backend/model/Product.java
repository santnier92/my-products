package com.devsenior.santnier.products_backend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Lombok, agrega un constructor vacio, atributos, setter y getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity //Representa un objeto o tabla en la BD
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre") //Mapeo entre el objeto y la BD
    private String name;

    @Column(name = "descripcion")
    private String description;

    @Column(name = "precio")
    private Double price;

    @Column (name = "cantidad")
    private Integer quantity;

}
