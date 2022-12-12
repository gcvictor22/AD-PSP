package com.salesianostriana.dam.ejercicio02.repo;

import com.salesianostriana.dam.ejercicio02.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Video, Long> {
}
