package com.salesianostriana.dam.trianafy.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class AddedTo {

    @EmbeddedId
    @Builder.Default
    private AddedToPk id = new AddedToPk();

    private LocalDate dateTime;
    private int orden;

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name = "song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name = "playlist_id")
    private Playlist playlist;

    //helpers song

    public void addToSong(Song s){
        this.song = s;
        s.getAddedTo().add(this);
    }

    public void removeFromCaja(Song s) {
        this.song = null;
        s.getAddedTo().remove(this);
    }

    //helpers playlist

    public void addToPlaylist(Playlist p){
        this.playlist = p;
        p.getAddedTo().add(this);
    }

    public void removeFromCaja(Playlist p) {
        this.song = null;
        p.getAddedTo().remove(this);
    }

}
