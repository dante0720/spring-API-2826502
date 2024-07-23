package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import jakarta.persistence;
import lombok.Setter;


@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = 'products')


public class Product {

    private Long Id;
    private String nombre;
    private Double precio;
}
