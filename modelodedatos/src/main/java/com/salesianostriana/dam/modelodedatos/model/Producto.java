package com.salesianostriana.dam.modelodedatos.model;

import lombok.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@NoArgsConstructor @AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class Producto {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private double pvp;

    @ManyToOne
    @JoinColumn(name = "categoria_id",
            foreignKey = @ForeignKey(name = "FK_PRODUCTO_CATEGORIA"))
    private Categoria categoria;

    public void addToCategoria(Categoria c){
        this.categoria = c;
        c.getProductosList().add(this);
    }

    public void deleteFromCategoria(Categoria c){
        this.categoria = null;
        c.getProductosList().remove(this);
    }

}
