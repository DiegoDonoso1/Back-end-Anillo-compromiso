package com.grupo6.demo.services.Anillos;

import com.grupo6.demo.entities.UsuarioEntity;
import com.grupo6.demo.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioEntity crearUsuario(UsuarioEntity usuario) {

        return usuarioRepository.save(usuario);
    }
}
