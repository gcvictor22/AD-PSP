package com.salesianostriana.dam.ejercicio02.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Curso {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    private double puntuacion;

    @ToString.Exclude
    @OneToMany(mappedBy = "curso", fetch = FetchType.EAGER)
    @Builder.Default
    private List<Video> videosCurso = new ArrayList<>();

    @PreRemove
    public void setNullVideos() {
        videosCurso.forEach(v -> v.setCurso(null));
    }

    @ManyToOne
    @JoinColumn(name = "profesor_id",
        foreignKey = @ForeignKey(name = "FK_PROFESOR_CURSO"))
    private Profesor profesor;



    public void addProfesor (Profesor p){
        this.profesor = p;
        p.getListaCursos().add(this);
    }

    public void deleteProfesor (Profesor p){
        this.profesor = null;
        p.getListaCursos().remove(this);
    }
}
