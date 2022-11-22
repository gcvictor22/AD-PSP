package com.salesianostrina.dam.ejemplodto.repository;

import com.salesianostrina.dam.ejemplodto.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaRepository extends CrudRepository<Persona, String> {
}
