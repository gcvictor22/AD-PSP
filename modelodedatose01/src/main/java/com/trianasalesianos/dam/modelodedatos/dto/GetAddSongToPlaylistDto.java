package com.trianasalesianos.dam.modelodedatos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAddSongToPlaylistDto {

    private Long id;
    private String name, description;
    private List<GetSongDto> songs;

}
