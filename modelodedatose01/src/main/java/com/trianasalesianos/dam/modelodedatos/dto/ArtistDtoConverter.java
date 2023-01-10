package com.trianasalesianos.dam.modelodedatos.dto;

import com.salesianostriana.dam.trianafy.model.Artist;
import org.springframework.stereotype.Component;

@Component
public class ArtistDtoConverter {

    public GetArtistDto artistToArtistDto(Artist a){

        return GetArtistDto
                .builder()
                .id(a.getId())
                .artist(a.getName())
                .build();
    }

}
