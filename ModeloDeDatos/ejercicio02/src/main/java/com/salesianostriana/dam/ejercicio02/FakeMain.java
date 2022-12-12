package com.salesianostriana.dam.ejercicio02;

import com.salesianostriana.dam.ejercicio02.model.Curso;
import com.salesianostriana.dam.ejercicio02.model.Profesor;
import com.salesianostriana.dam.ejercicio02.model.Video;
import com.salesianostriana.dam.ejercicio02.repo.CursoRepo;
import com.salesianostriana.dam.ejercicio02.repo.ProfesorRepo;
import com.salesianostriana.dam.ejercicio02.repo.VideoRepo;
import com.salesianostriana.dam.ejercicio02.service.CursoServicio;
import com.salesianostriana.dam.ejercicio02.service.ProfesorServicio;
import com.salesianostriana.dam.ejercicio02.service.VideoServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FakeMain {

    private final CursoServicio cursoServicio;
    private final ProfesorServicio profesorServicio;
    private final VideoServicio videoServicio;

    @PostConstruct
    public void run(){

        Curso c1 = Curso.builder()
                .nombre("HTML y CSS")
                .puntuacion(9.5)
                .build();

        Curso c2 = Curso.builder()
                .nombre("Python")
                .puntuacion(8.5)
                .build();

        cursoServicio.save(c1);
        cursoServicio.save(c2);


        Video v1 = Video.builder()
                .titulo("Introducción")
                .orden(1)
                .descripcion("Introducción a html y css")
                .url("https://urlejemplo.com")
                .build();

        Video v2 = Video.builder()
                .titulo("Final")
                .orden(2)
                .descripcion("Finalizamos con html y css")
                .url("https://urlejemplo.com")
                .build();

        Video v3 = Video.builder()
                .titulo("Ejercicios Python")
                .orden(2)
                .descripcion("Ejercicios simples de Python")
                .url("https://urlejemplo.com")
                .build();

        videoServicio.save(v1);
        videoServicio.save(v2);


        Profesor p1 = Profesor.builder()
                .nombre("José Domingo")
                .email("josedomingo@gmail.com")
                .puntuacion(10)
                .build();

        Profesor p2 = Profesor.builder()
                .nombre("Chema")
                .email("chema@gmail.com")
                .puntuacion(7)
                .build();

        profesorServicio.save(p1);
        profesorServicio.save(p2);

        List<Curso> auxCursos = List.of(c1, c2);
        List<Profesor> auxProfesor = List.of(p1, p2);

        v1.addToCurso(c1);
        v2.addToCurso(c1);
        v3.addToCurso(c2);

        cursoServicio.saveAll(auxCursos);

        c1.addProfesor(p1);
        c2.addProfesor(p2);

        profesorServicio.saveAll(auxProfesor);

    }

}
