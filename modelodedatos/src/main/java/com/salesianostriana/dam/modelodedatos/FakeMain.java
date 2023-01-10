package com.salesianostriana.dam.modelodedatos;

import com.salesianostriana.dam.modelodedatos.model.Categoria;
import com.salesianostriana.dam.modelodedatos.model.Producto;
import com.salesianostriana.dam.modelodedatos.repos.CategoriaRepo;
import com.salesianostriana.dam.modelodedatos.repos.ProductoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FakeMain {

    private final ProductoRepo productoRepo;
    private final CategoriaRepo categoriaRepo;

    @PostConstruct
    public void run(){

        Producto p1 = Producto.builder()
                .nombre("Nevera")
                .pvp(1200.45)
                .build();

        Producto p2 = Producto.builder()
                .nombre("Lavadora")
                .pvp(850.99)
                .build();

        productoRepo.save(p1);
        productoRepo.save(p2);

        Categoria c1 = Categoria.builder()
                .nombre("Electrodomésticos")
                .build();

        Categoria c2 = Categoria.builder()
                .nombre("Hogar")
                .build();

        categoriaRepo.save(c2);

        List<Producto> auxList = List.of(p1, p2);

        p1.addToCategoria(c1);
        p1.addToCategoria(c1);

        c1.addToCatPadre(c2);

        categoriaRepo.save(c1);
        productoRepo.saveAll(auxList);


        categoriaRepo.findAll()
                .forEach(c -> {
                    System.out.println("Curso: " + c.toString());
                    c.getProductosList().forEach(System.out::println);
                });
    }

}
