package com.salesianostriana.dam.ejercicio02.service;

import com.salesianostriana.dam.ejercicio02.model.Curso;
import com.salesianostriana.dam.ejercicio02.repo.CursoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoServicio {

    private final CursoRepo cursoRepo;

    public void save(Curso c){
        cursoRepo.save(c);
    }

    public void saveAll(List<Curso> aux){
        cursoRepo.saveAll(aux);
    }

    public List<Curso> findAll(){
        return cursoRepo.findAll();
    }

}
