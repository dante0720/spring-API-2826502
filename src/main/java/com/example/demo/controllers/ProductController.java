package com.example.demo.controllers;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;




@RestController
@RequestMapping("/api/products")
public class ProductController {

    //Inyectar el servicio
    private ProductService service = 
                new ProductService();


    //Primer endpoint
    // un metoedo en un controlador


    @GetMapping("/api/products")
    public String saludo(){
        return "Hola ficha 2826502";
    }


    //segundo endpoint 
    //Get:obtener informacion sin alterarla
    //    (inmutable)
    @GetMapping("/{idproducto}")
    public String findById(@PathVariable String idproducto) {
        return new String("aqui se mostrara el producto cuyo id es : "+ idproducto);
    }

    @GetMapping
    public List<Product> findAllProducts(){
        //utilizo el servicio
        return service.findAllProducts();
    }
    
}



