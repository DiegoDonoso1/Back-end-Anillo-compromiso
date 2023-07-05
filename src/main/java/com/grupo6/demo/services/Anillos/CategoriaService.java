package com.grupo6.demo.services.Anillos;


import com.grupo6.demo.entities.CategoriaEntity;

import java.util.List;

public interface CategoriaService  {

    List<CategoriaEntity> obtenerCategorias();

    CategoriaEntity crearCategoria(CategoriaEntity categoria);

    CategoriaEntity buscarCategoriaId(Long id);
}
