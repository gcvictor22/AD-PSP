package com.salesianostriana.dam.ejercicio02.repo;

import com.salesianostriana.dam.ejercicio02.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepo extends JpaRepository<Curso, Long> {
}
