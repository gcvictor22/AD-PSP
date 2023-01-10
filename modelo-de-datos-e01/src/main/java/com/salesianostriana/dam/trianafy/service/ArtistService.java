package com.salesianostriana.dam.trianafy.service;


import com.salesianostriana.dam.trianafy.model.Artist;
import com.salesianostriana.dam.trianafy.model.Playlist;
import com.salesianostriana.dam.trianafy.repos.ArtistRepository;
import com.salesianostriana.dam.trianafy.repos.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArtistService {

    private final ArtistRepository repository;
    private final PlaylistRepository playlistRepository;


    public Artist add(Artist artist) {
        return repository.save(artist);
    }

    public Optional<Artist> findById(Long id) {
        return repository.findById(id);
    }

    public List<Artist> findAll() {
        return repository.findAll();
    }

    public Artist edit(Artist artist) {
        return repository.save(artist);
    }

    public void delete(Artist artist) {
        repository.delete(artist);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public boolean existsById(Long id){
        if(repository.existsById(id)){
            return true;
        }else{
            return false;
        }
    }

    public List<Playlist> findPlayLists(Artist a){

        Optional<Artist> art = repository.findById(a.getId());
        List<Playlist> aux = new ArrayList<>();

        if (art.isPresent()){
            aux = playlistRepository.findAllPlaylistFromArtist(art.get().getName());
        }

        return aux;
    }

}
