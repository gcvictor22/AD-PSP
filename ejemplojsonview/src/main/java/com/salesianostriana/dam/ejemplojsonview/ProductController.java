package com.salesianostriana.dam.ejemplojsonview;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/producto/")
public class ProductController {

    private List<ProductoDto> todos =
            new ArrayList<>(List.of(
                    ProductoDto.builder()
                            .id(1L)
                            .nombre("Café")
                            .descripcion("Café colombiano")
                            .images(List.of(
                                    "url img 1",
                                    "url img 2"
                            ))
                            .build(),
                    ProductoDto.builder()
                            .id(2L)
                            .nombre("Jamón")
                            .descripcion("Jamón de bellota")
                            .build()
            ));


    @GetMapping("/")
    @JsonView(ProductoView.Master.class)
    public ResponseEntity<List<ProductoDto>> findAll(){
        return ResponseEntity.ok(
                todos.stream()
                        .map(ProductoDto::productoSinDarDettalle)
                        .toList()
        );
    }

    @GetMapping("/{id}")
    @JsonView(ProductoView.Detail.class)
    public ResponseEntity<ProductoDto> findByid(@PathVariable Long id){
        ProductoDto selected = todos.stream()
                .filter(p -> p.getId() == id)
                .findFirst().get();
        return ResponseEntity.ok(selected);
    }

    @PostMapping("/")
    @JsonView(ProductoView.Detail.class)
    public ResponseEntity<ProductoDto> create(@RequestBody ProductoDto dto){

        dto.setId((long)todos.size()+1);
        todos.add(dto);


        return ResponseEntity.status(HttpStatus.CREATED).body(dto);

    }
}

