package com.salesianostriana.dam.trianafy.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@NamedEntityGraph
        (name="playlist-con-addedTo",
                attributeNodes = {
                        @NamedAttributeNode(value = "addedTo",
                                subgraph = "addedTo-con-song")
                }, subgraphs = {
                @NamedSubgraph(name="addedTo-con-song",
                        attributeNodes = {
                                @NamedAttributeNode("song")
                        })
        })
public class Playlist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

    @OneToMany(mappedBy = "playlist")
    @Builder.Default
    private List<AddedTo> addedTo = new ArrayList<>();


}
