package com.salesianostriana.dam.ejercicio02.model;

import lombok.*;

import javax.persistence.*;
import javax.websocket.server.ServerEndpoint;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Profesor {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre, email;

    private double puntuacion;

    @ToString.Exclude
    @OneToMany(mappedBy = "profesor", fetch = FetchType.EAGER)
    @Builder.Default
    private List<Curso> listaCursos = new ArrayList<>();

    @PreRemove
    public void setNullProfesor() {
        listaCursos.forEach(a -> a.setProfesor(null));
    }
}
