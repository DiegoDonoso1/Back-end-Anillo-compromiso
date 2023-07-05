package com.grupo6.demo.controllers;

import com.grupo6.demo.entities.CategoriaEntity;
import com.grupo6.demo.services.Anillos.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    CategoriaServiceImpl categoriaService;

    @GetMapping("/obtener")
    public List<CategoriaEntity> obtenerCategorias(){
        return categoriaService.obtenerCategorias();
    }

    @PostMapping("/nuevo")
    public ResponseEntity<CategoriaEntity> guardarCategoria(@RequestBody CategoriaEntity categoria){
        return ResponseEntity.ok(categoriaService.crearCategoria(categoria));
    }
}
