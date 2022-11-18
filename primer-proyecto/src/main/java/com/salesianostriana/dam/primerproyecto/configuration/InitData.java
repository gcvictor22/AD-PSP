package com.salesianostriana.dam.primerproyecto.configuration;

import com.salesianostriana.dam.primerproyecto.model.Country;
import com.salesianostriana.dam.primerproyecto.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class InitData {

    private final CountryRepository repo;

    @PostConstruct
    public void init(){
        Country spain = new Country();
        spain.setCode("es");
        spain.setName("España");
        spain.setCapital("Madrid");
        spain.setCurrency("npi");
        spain.setPopulation(52);

        repo.save(spain);
    }

}
