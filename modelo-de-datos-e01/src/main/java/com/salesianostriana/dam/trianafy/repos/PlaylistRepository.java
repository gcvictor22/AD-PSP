package com.salesianostriana.dam.trianafy.repos;

import com.salesianostriana.dam.trianafy.model.Playlist;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

    @EntityGraph("playlist-con-addedTo")
    List<Playlist> findDistinctByName(String name);

    @EntityGraph("playlist-con-addedTo")
    Optional<Playlist> findByid(Long id);

    @Query("""
            select distinct p from Playlist p
            left join fetch p.addedTo at
            left join fetch at.song s
            left join fetch s.artist a
            where a.name = ?1
            """)
    List<Playlist> findAllPlaylistFromArtist(String name);

}
