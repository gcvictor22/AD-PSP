package com.salesianostriana.dam.ejerciciopractica.controller;

import com.salesianostriana.dam.ejerciciopractica.model.Alumno;
import com.salesianostriana.dam.ejerciciopractica.repository.MainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class MainController {

    private final MainRepository repo;

    @GetMapping("/alumnos")
    public ResponseEntity<List<Alumno>> findAll(){
        return ResponseEntity.ok(repo.findAll());
    }

    @GetMapping("/alumnos/{id}")
    public ResponseEntity<Alumno> findById(@PathVariable Long id) {
        return ResponseEntity.of(repo.findFirstById(id));
    }

    @PostMapping("/new-alumno")
    public ResponseEntity<Alumno> createAlumno(@RequestBody Alumno a1){
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(repo.save(a1));
    }

    @PutMapping("edit-alumno/{id}")
    public ResponseEntity<Alumno> editAlumno (@RequestBody Alumno a1, @PathVariable Long id){
        return ResponseEntity.of(
                repo.findFirstById(id)
                        .map(old -> {
                            old.setName(a1.getName());
                            old.setLastName(a1.getLastName());
                            old.setBornPlace(a1.getBornPlace());
                            old.setAge(a1.getAge());
                            return Optional.of(repo.save(old));
                        })
                        .orElse(Optional.empty())
        );
    }

    @DeleteMapping("eliminar-alumno/{id}")
    public ResponseEntity<Alumno> deleteAlumno(@PathVariable Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
        }
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


}
