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
public class Artist {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
