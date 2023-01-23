package com.salesianostriana.dam.restquery;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

    @Id
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    private double price;

    private boolean available;

}
