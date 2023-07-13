package com.grupo6.demo.services.Anillos;

import com.grupo6.demo.entities.TallaEntity;

import java.util.List;

public interface TallaService {


    List<TallaEntity> obtenerTallas();

    TallaEntity crearTalla(TallaEntity talla);

    TallaEntity obtenerTallaId(Long id);
}
