package com.grupo6.demo.services.Anillos;


import com.grupo6.demo.entities.CategoriaEntity;
import com.grupo6.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<CategoriaEntity> obtenerCategorias(){
        return categoriaRepository.findAll();
    }


    @Override
    public CategoriaEntity crearCategoria(CategoriaEntity nuevaCategoria){
        return categoriaRepository.save(nuevaCategoria);
    }

    @Override
    public CategoriaEntity buscarCategoriaId(Long id){
        return categoriaRepository.findById(id).get();
    }
}
