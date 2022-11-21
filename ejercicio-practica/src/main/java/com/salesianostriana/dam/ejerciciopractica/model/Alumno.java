package com.salesianostriana.dam.ejerciciopractica.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Alumno {

    @Id @GeneratedValue
    private Long id;

    private String name, lastName, bornPlace;
    private int age;
}
