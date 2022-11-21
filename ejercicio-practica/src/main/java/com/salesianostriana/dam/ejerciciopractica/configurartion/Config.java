package com.salesianostriana.dam.ejerciciopractica.configurartion;

import com.salesianostriana.dam.ejerciciopractica.model.Alumno;
import com.salesianostriana.dam.ejerciciopractica.repository.MainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class Config {

    private final MainRepository repo;

    @PostConstruct
    public void init(){
        Alumno a1 = new Alumno();
        a1.setName("Pepe");
        a1.setLastName("Domínguez");
        a1.setBornPlace("Toledo");
        a1.setAge(16);

        repo.save(a1);
    }

}
