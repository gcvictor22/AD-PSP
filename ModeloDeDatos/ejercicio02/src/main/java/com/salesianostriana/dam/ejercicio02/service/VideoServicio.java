package com.salesianostriana.dam.ejercicio02.service;

import com.salesianostriana.dam.ejercicio02.model.Video;
import com.salesianostriana.dam.ejercicio02.repo.VideoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VideoServicio {

    private final VideoRepo videoRepo;

    public void save(Video v){
        videoRepo.save(v);
    }

    public void saveAll(List<Video> aux){
        videoRepo.saveAll(aux);
    }

    public List<Video> findAll(){
        return videoRepo.findAll();
    }

}
