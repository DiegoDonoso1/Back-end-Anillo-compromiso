package com.grupo6.demo.services.Anillos;

import com.grupo6.demo.entities.AnillosEntity;

import java.util.List;

public interface AnillosService {

    List<AnillosEntity> traerAnillo();

    AnillosEntity guardarAnillo(AnillosEntity anillo);


}
