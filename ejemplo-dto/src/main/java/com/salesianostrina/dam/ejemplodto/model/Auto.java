package com.salesianostrina.dam.ejemplodto.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Auto {

    @Id
    private String placa;

    private String marca, modelo, propietario;

}
