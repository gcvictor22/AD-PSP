package com.salesianostriana.dam.ejercicio02.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Video {

    @Id
    @GeneratedValue
    private Long id;

    private int orden;

    private String titulo, descripcion, url;

    @ManyToOne
    @JoinColumn(name = "curso_id",
            foreignKey = @ForeignKey(name = "FK_VIDEO_CURSO"))
    private Curso curso;

    public void addToCurso (Curso c){
        this.curso = c;
        c.getVideosCurso().add(this);
    }

    public void deleteFromCurso (Curso c){
        this.curso = c;
        c.getVideosCurso().remove(this);
    }

}
