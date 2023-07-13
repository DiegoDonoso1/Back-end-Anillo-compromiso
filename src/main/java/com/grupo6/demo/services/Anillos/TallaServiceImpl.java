package com.grupo6.demo.services.Anillos;

import com.grupo6.demo.entities.TallaEntity;
import com.grupo6.demo.repositories.TallaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TallaServiceImpl implements TallaService{

    @Autowired
    private TallaRepository tallaRepository;

    @Override
    public List<TallaEntity> obtenerTallas() { return tallaRepository.findAll();}

    @Override
    public TallaEntity crearTalla(TallaEntity nuevaTalla){
        return tallaRepository.save(nuevaTalla);
    }
    @Override
    public TallaEntity obtenerTallaId(Long id) {
        return tallaRepository.findById(id).get();
    }



}
