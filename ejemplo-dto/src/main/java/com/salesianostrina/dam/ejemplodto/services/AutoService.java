package com.salesianostrina.dam.ejemplodto.services;

import com.salesianostrina.dam.ejemplodto.model.Auto;
import com.salesianostrina.dam.ejemplodto.repository.AutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class AutoService {

    private final AutoRepository repo;

    public Auto guardar(Auto a){
        return repo.save(a);
    }

    public void eliminar(String id){
        repo.deleteById(id);
    }

    public Optional<Auto> getValor(String id){
        return repo.findById(id);
    }

    public List<Auto> getTodos(){
        return (List<Auto>) repo.findAll();
    }

}
