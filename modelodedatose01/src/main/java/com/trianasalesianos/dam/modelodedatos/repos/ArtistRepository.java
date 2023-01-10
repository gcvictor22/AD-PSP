package com.trianasalesianos.dam.modelodedatos.repos;

import com.salesianostriana.dam.trianafy.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
