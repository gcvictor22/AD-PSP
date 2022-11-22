package com.salesianostriana.dam.boletin1.config;

import com.salesianostriana.dam.boletin1.model.Monumento;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitData {

    @PostConstruct
    public void createMonumento(){

        Monumento m1 = new Monumento();

        

    }

}
