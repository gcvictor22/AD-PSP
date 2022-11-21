package com.salesianostriana.dam.ejerciciopractica.repository;

import com.salesianostriana.dam.ejerciciopractica.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MainRepository extends JpaRepository<Alumno, Long> {
    Optional<Alumno> findFirstByCode(String code);
}
