package com.salesianostriana.dam.trianafy.model;

import lombok.*;
import org.springframework.core.annotation.Order;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Song {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String album;
    @Column(name = "year_of_song")
    private String year;

    @ManyToOne
    private Artist artist;

    @OneToMany(mappedBy = "song")
    @Builder.Default
    @OrderColumn(name = "orden")
    private List<AddedTo> addedTo = new ArrayList<>();

}
