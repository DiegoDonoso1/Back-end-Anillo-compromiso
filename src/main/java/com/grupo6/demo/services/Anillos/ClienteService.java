package com.grupo6.demo.services.Anillos;


import com.grupo6.demo.entities.ClienteEntity;

import java.util.List;

public interface ClienteService  {

    List<ClienteEntity> obtenerCliente();

    ClienteEntity crearCliente(ClienteEntity cliente);

    ClienteEntity buscarClienteId(Long id);
}
