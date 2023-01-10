package com.trianasalesianos.dam.modelodedatos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetSongDto {

    private Long id;
    private String title, artist, album, year;

}
