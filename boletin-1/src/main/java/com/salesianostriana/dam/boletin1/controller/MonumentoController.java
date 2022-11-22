package com.salesianostriana.dam.boletin1.controller;

import com.salesianostriana.dam.boletin1.model.Monumento;
import com.salesianostriana.dam.boletin1.repos.MonumentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MonumentoController {

    private final MonumentoRepository repo;

    @GetMapping("/monumento/")
    public ResponseEntity<List<Monumento>> findAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/monumento/{id}")
    public ResponseEntity<Monumento> findById(@PathVariable Long id){
        return ResponseEntity.of(repo.findById(id));
    }

    @PostMapping("/monumento/")
    public ResponseEntity<Monumento> create(@RequestBody Monumento m){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(repo.save(m));
    }

    @PutMapping("/monumento/{id}")
    public ResponseEntity<Monumento> update(@RequestBody Monumento m, @PathVariable Long id){
        return ResponseEntity.of(
                repo.findById(id)
                        .map(old -> {
                            old.setCity(m.getCity());
                            old.setCod(m.getCod());
                            old.setCountryName(m.getCountryName());
                            old.setMonumentName(m.getMonumentName());
                            old.setImgUrl(m.getImgUrl());
                            old.setDescription(m.getDescription());
                            old.setLat(m.getLat());
                            old.setLon(m.getLon());
                            return Optional.of(repo.save(old));
                        })
                        .orElse(Optional.empty())
        );
    }

}
