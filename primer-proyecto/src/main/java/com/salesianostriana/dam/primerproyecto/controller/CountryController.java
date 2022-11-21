package com.salesianostriana.dam.primerproyecto.controller;

import com.salesianostriana.dam.primerproyecto.model.Country;
import com.salesianostriana.dam.primerproyecto.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class CountryController {

    private final CountryRepository repo;

    @GetMapping("/country")
    //public List<Country> findAll(){
    public ResponseEntity<List<Country>> findAll() {
        //return repo.findAll();
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/country/{code}")
    public ResponseEntity<Country> findByCode(
            @PathVariable String code
    ) {
        return ResponseEntity.of(repo.findFirstByCode(code));
    }

    @PostMapping("/country")
    public ResponseEntity<Country> newCountry(@RequestBody Country country) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(repo.save(country));
    }

    @PutMapping("/country/{id}")
    public ResponseEntity<Country> updateCountry(@RequestBody Country country, @PathVariable Long id) {

        return ResponseEntity.of(
                repo.findById(id)
                        .map(old -> {
                            old.setCapital(country.getCapital());
                            old.setCode(country.getCode());
                            old.setName(country.getName());
                            old.setCurrency(country.getCurrency());
                            old.setPopulation(country.getPopulation());
                            return Optional.of(repo.save(old));
                        })
                        .orElse(Optional.empty())
                //.orElseThrow(() -> new CountryNotFoundException(...)); Codigo correcto
        );

    }

    @DeleteMapping("/country/{id}")
    public ResponseEntity<Country> deleteCountry(@PathVariable Long id){
        if(repo.existsById(id))
            repo.deleteById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
