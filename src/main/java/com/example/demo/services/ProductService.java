package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repositories.ProductRepository;


@Service
public class ProductService {

    //Inyectar la dependencia 
    //al repositorio

    private ProductRepository repository 
        = new ProductRepository();

    //operaciones de logica de negocio
    //casos de uso, historias de ususario
    //requerimientos funcionales

    public List<Product> findAllProducts(){
        return repository.findAll();
    }

}
