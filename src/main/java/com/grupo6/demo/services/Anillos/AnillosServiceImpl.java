package com.grupo6.demo.services.Anillos;


import com.grupo6.demo.entities.AnillosEntity;
import com.grupo6.demo.repositories.AnillosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnillosServiceImpl implements AnillosService {

    @Autowired
    AnillosRepository anillosRepository;

    @Override
    public List<AnillosEntity> traerAnillo(){
        return  anillosRepository.findAll();
    }

    @Override
    public AnillosEntity guardarAnillo(AnillosEntity anillo){
        return anillosRepository.save(anillo);
    }

    @Override
    public  AnillosEntity obtenerAnilloId(Long id){
        return anillosRepository.findById(id).get();}

}
