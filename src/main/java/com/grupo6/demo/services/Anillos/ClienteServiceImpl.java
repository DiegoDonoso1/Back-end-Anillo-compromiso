package com.grupo6.demo.services.Anillos;


import com.grupo6.demo.entities.ClienteEntity;
import com.grupo6.demo.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteEntity> obtenerCliente(){
        return clienteRepository.findAll();
    }


    @Override
    public ClienteEntity crearCliente(ClienteEntity nuevoCliente){
        return clienteRepository.save(nuevoCliente);
    }

    @Override
    public ClienteEntity buscarClienteId(Long id){
        return clienteRepository.findById(id).get();
    }
}
