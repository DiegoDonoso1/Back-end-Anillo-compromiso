package com.grupo6.demo.services.Anillos;


import com.grupo6.demo.entities.AnillosEntity;
import com.grupo6.demo.entities.CategoriaEntity;
import com.grupo6.demo.repositories.AnillosRepository;
import com.grupo6.demo.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnillosServiceImpl implements AnillosService {

    @Autowired
    AnillosRepository anillosRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<AnillosEntity> traerAnillo(){
        return  anillosRepository.findAll();
    }

    @Override
    public AnillosEntity traerAnilloPorId(Long id){
        return (AnillosEntity)this.anillosRepository.findById(id).get();
    }

    @Override
    public AnillosEntity guardarAnillo(AnillosEntity anillo){
        return anillosRepository.save(anillo);
    }

    @Override
    public AnillosEntity editarAnillo(Long id  ,AnillosEntity anillosEntity){
        Boolean existe = this.anillosRepository.existsById(id);
        if(existe){
            AnillosEntity anilloSeleccionado = this.anillosRepository.findById(id).get();
            anilloSeleccionado.setNombre(anillosEntity.getNombre());
            anilloSeleccionado.setPrecio(anillosEntity.getPrecio());
            anilloSeleccionado.setDescripcion(anillosEntity.getDescripcion());
            CategoriaEntity categoriaAnillo = anillosEntity.getCategoriaAnillo();
            if (categoriaAnillo != null && categoriaAnillo.getId() != null) {
                CategoriaEntity categoriaExistente = categoriaRepository.findById(categoriaAnillo.getId()).orElse(null);
                if (categoriaExistente != null) {
                    anilloSeleccionado.setCategoriaAnillo(categoriaExistente);
                }
            }
            return anillosRepository.save(anilloSeleccionado);
        }else{
            return null;
        }
    }


}
