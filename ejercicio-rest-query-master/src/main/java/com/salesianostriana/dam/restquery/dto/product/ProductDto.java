package com.salesianostriana.dam.restquery.dto.product;

import com.salesianostriana.dam.restquery.Product;
import lombok.*;

import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProductDto {

    private String productName;
    private LocalDate releaseDate;
    private double price;
    private boolean available;

    public static ProductDto of (Product p){
        return ProductDto.builder()
                .productName(p.getProductName())
                .releaseDate(p.getReleaseDate())
                .price(p.getPrice())
                .available(p.isAvailable())
                .build();

    }

}
