package com.trianasalesianos.dam.modelodedatos.repos;

import com.salesianostriana.dam.trianafy.model.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
