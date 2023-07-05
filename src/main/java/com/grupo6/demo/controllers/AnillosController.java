package com.grupo6.demo.controllers;

import com.grupo6.demo.entities.AnillosEntity;
import com.grupo6.demo.entities.CategoriaEntity;
import com.grupo6.demo.services.Anillos.AnillosServiceImpl;
import com.grupo6.demo.services.Anillos.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("anillos")
public class AnillosController {

    @Autowired
    AnillosServiceImpl anillosService;

    @Autowired
    CategoriaServiceImpl categoriaService;

    @GetMapping("/obtener")
    public List<AnillosEntity> traerAnillos(){
        return anillosService.traerAnillo();
    }

    @PostMapping("/nuevo/{id}")
    public ResponseEntity<AnillosEntity> guardarAnillo(@RequestBody AnillosEntity nuevoAnillo,
                                                       @PathVariable Long id){

        CategoriaEntity categoriaElegida = categoriaService.buscarCategoriaId(id);
        nuevoAnillo.setCategoriaAnillo(categoriaElegida);
        return ResponseEntity.ok(anillosService.guardarAnillo(nuevoAnillo));
    }
}
