package com.grupo6.demo.controllers;

import com.grupo6.demo.entities.UsuarioEntity;
import com.grupo6.demo.services.Anillos.UsuarioService;
import com.grupo6.demo.services.Anillos.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioServiceImpl usuarioService;

    @PostMapping("/crearusuario")
    public ResponseEntity<UsuarioEntity> crearUsuario(@RequestBody UsuarioEntity usuario) {
        return ResponseEntity.ok(usuarioService.crearUsuario(usuario));
    }

}
