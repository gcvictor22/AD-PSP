package com.salesianostriana.dam.modelodedatos.repos;

import com.salesianostriana.dam.modelodedatos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepo extends JpaRepository<Producto, Long> {
}
