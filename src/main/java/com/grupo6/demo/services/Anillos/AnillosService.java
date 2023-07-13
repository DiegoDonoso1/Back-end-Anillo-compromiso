package com.grupo6.demo.services.Anillos;

import com.grupo6.demo.entities.AnillosEntity;

import java.util.List;

public interface AnillosService {

    List<AnillosEntity> traerAnillo();

    AnillosEntity traerAnilloPorId(Long id);

    AnillosEntity guardarAnillo(AnillosEntity anillo);

    AnillosEntity editarAnillo(Long id, AnillosEntity anillosEntity);
}
