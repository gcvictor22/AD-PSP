package com.salesianostriana.dam.modelodedatos.repos;

import com.salesianostriana.dam.modelodedatos.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepo extends JpaRepository<Categoria, Long> {
}
