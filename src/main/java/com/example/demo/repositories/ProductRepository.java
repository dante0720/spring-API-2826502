package com.example.demo.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Product;

@Repository
public class ProductRepository {
    //La lista de un reposistorio
    //debe ser inmutable
    //La logica de negocio no se modifica
    //La lista de un repositorio 

    List<Product> productos = List.of(Product.builder()
        .Id(1L)
        .nombre("Silla reclinable")
        .precio(77355.3)
        .build()
        , 
        new Product(2L, "Escritorio", 663773.7));
    

    //metodo(Comportamiento) para consultar
    //los productos del repository

    public List<Product> findAll(){

        return this.productos;

    }

}
