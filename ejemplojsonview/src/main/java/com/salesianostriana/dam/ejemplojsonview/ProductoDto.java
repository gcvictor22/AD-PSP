package com.salesianostriana.dam.ejemplojsonview;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductoDto {

    @JsonView(ProductoView.Master.class)
    private Long id;
    @JsonView(ProductoView.Master.class)
    private String nombre;
    @JsonView(ProductoView.Detail.class)
    private String descripcion;
    @JsonView(ProductoView.Detail.class)
    private List<String> images;
    @JsonView(ProductoView.Detail.class)
    private double precio;

    public static ProductoDto productoSinDarDettalle(ProductoDto dto){
        return ProductoDto.builder()
                .id(dto.getId())
                .nombre(dto.getNombre())
                .images(dto.getImages())
                .build();
    }
}
