package com.grupo6.demo.controllers;

import com.grupo6.demo.entities.AnillosEntity;
import com.grupo6.demo.entities.TallaEntity;
import com.grupo6.demo.services.Anillos.AnillosServiceImpl;
import com.grupo6.demo.services.Anillos.TallaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/tallas")
public class TallaController {

    @Autowired
    TallaServiceImpl tallaService;

    @Autowired
    AnillosServiceImpl anillosService;

    @GetMapping("/obtener")
    public List<TallaEntity> obtenerTallas() {
        return tallaService.obtenerTallas();
    }

    @PostMapping("/nueva/{id}")
    public ResponseEntity<TallaEntity> guardarTalla(@RequestBody TallaEntity nuevaTalla,
                                                    @PathVariable Long id){
        AnillosEntity anilloElegido = anillosService.obtenerAnilloId(id);
        nuevaTalla.setAnilloTalla(anilloElegido);
        return  ResponseEntity.ok(tallaService.crearTalla(nuevaTalla));
    }



}
