package com.salesianostriana.dam.primerproyecto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String controllerExample(){
        return "Hola mundo";
    }

}
