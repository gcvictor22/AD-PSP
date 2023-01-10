package com.salesianostriana.dam.modelodedatos.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;

    @ToString.Exclude
    @OneToMany(mappedBy = "categoria", fetch = FetchType.EAGER)
    @Builder.Default
    private List<Producto> productosList = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "categoria_id",
            foreignKey = @ForeignKey(name = "FK_CATEGORIA_CATPADRE"))
    private Categoria catPadre;

    @ToString.Exclude
    @OneToMany(mappedBy = "catPadre", fetch = FetchType.EAGER)
    @Builder.Default
    private List<Categoria> catHijasList = new ArrayList<>();


    @PreRemove
    public void nullProductos(){
        productosList.forEach(p -> p.setCategoria(null));
    }


    public void addToCatPadre(Categoria c){
        this.catPadre = c;
        c.getCatHijasList().add(this);
    }

    public void deleteFromCatPadre(Categoria c){
        this.catPadre = null;
        c.getCatHijasList().remove(this);
    }

}
