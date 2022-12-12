package com.salesianostriana.dam.ejercicio02.service;

import com.salesianostriana.dam.ejercicio02.model.Profesor;
import com.salesianostriana.dam.ejercicio02.repo.ProfesorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProfesorServicio {

    private final ProfesorRepo profesorRepo;

    public void save(Profesor p){
        profesorRepo.save(p);
    }

    public void saveAll(List<Profesor> aux) {
        profesorRepo.saveAll(aux);
    }

    public List<Profesor> findAll(){
        return profesorRepo.findAll();
    }

}
