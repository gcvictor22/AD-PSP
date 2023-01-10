package com.trianasalesianos.dam.modelodedatos.repos;

import com.salesianostriana.dam.trianafy.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
