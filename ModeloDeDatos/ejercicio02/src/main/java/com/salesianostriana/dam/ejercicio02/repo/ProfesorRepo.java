package com.salesianostriana.dam.ejercicio02.repo;

import com.salesianostriana.dam.ejercicio02.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepo extends JpaRepository<Profesor, Long> {
}
