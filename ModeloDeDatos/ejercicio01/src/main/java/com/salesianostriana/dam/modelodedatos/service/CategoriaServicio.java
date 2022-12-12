package com.salesianostriana.dam.modelodedatos.service;

import com.salesianostriana.dam.modelodedatos.model.Categoria;
import com.salesianostriana.dam.modelodedatos.repos.CategoriaRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaServicio {

    private final CategoriaRepo categoriaRepo;

    public void save(Categoria c){
        categoriaRepo.save(c);
    }

    public void saveAll(List<Categoria> aux){
        categoriaRepo.saveAll(aux);
    }

    public List<Categoria> findAll(){
        return categoriaRepo.findAll();
    }

}
