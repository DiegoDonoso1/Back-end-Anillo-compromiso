package com.grupo6.demo.controllers;

import com.grupo6.demo.entities.ClienteEntity;
import com.grupo6.demo.services.Anillos.ClienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    ClienteServiceImpl clienteService;

    @GetMapping("/obtener")
    public List<ClienteEntity> obtenerCliente(){
        return clienteService.obtenerCliente();
    }

    @PostMapping("/nuevo")
    public ResponseEntity<ClienteEntity> guardarCategoria(@RequestBody ClienteEntity cliente){
        return ResponseEntity.ok(clienteService.crearCliente(cliente));
    }
}
