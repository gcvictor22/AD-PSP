package com.salesianostriana.dam.ejerciciopractica.controller;

import com.salesianostriana.dam.ejerciciopractica.model.Alumno;
import com.salesianostriana.dam.ejerciciopractica.repository.MainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainRepository repo;

    @GetMapping("/")
    public ResponseEntity<List<Alumno>> findAll(){
        return ResponseEntity.ok(repo.findAll());
    }

}
