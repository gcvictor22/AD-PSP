package com.salesianostriana.dam.modelodedatos.service;

import com.salesianostriana.dam.modelodedatos.model.Producto;
import com.salesianostriana.dam.modelodedatos.repos.ProductoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoServicio {

    private final ProductoRepo productoRepo;

    public void save(Producto p){
        productoRepo.save(p);
    }

    public void saveAll(List<Producto> aux){
        productoRepo.saveAll(aux);
    }

    public List<Producto> findAll(){
        return productoRepo.findAll();
    }

}
