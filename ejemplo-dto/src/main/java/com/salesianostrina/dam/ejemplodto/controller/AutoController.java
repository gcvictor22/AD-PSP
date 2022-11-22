package com.salesianostrina.dam.ejemplodto.controller;

import com.salesianostrina.dam.ejemplodto.model.Auto;
import com.salesianostrina.dam.ejemplodto.services.AutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "ws/auto")
@CrossOrigin("*")
@RequiredArgsConstructor
public class AutoController {

    private final AutoService service;

    @GetMapping("/")
    public List<Auto> getTodos(){
        return service.getTodos();
    }

    @GetMapping("/(placa)")
    public Optional<Auto> getById(@PathVariable String placa){
        return service.getValor(placa);
    }

    @PostMapping("/guardar")
    public Auto guardar(@RequestBody Auto auto){
        return service.guardar(auto);
    }

    @DeleteMapping("/eliminar/(placa)")
    public Optional<Auto> eliminar(@PathVariable String placa){
        Optional<Auto> auto = service.getValor(placa);
        service.eliminar(placa);
        return auto;
    }

}
