package com.salesianostriana.dam.ejemplojsonview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.http.ResponseEntity;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ProductoExtendidoDto extends ProductoDto {

    private List<Integer> valoraciones;
    private double valMedia;

    public static ProductoExtendidoDto of(Product p){
        return new ProductoExtendidoDto();
    }

}
