package com.salesianostriana.dam.boletin1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Monumento {

    @Id
    @GeneratedValue
    private Long id;

    private String cod, countryName, city, monumentName, description, imgUrl;

    private double lat, lon;

}
