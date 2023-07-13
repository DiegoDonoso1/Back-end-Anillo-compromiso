package com.grupo6.demo.controllers;

import com.grupo6.demo.dto.AnillosDto;
import com.grupo6.demo.dto.CategoriaDto;
import com.grupo6.demo.entities.AnillosEntity;
import com.grupo6.demo.entities.CategoriaEntity;
import com.grupo6.demo.services.Anillos.AnillosServiceImpl;
import com.grupo6.demo.services.Anillos.CategoriaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("/*")
@RequestMapping("anillos")
public class AnillosController {

    @Autowired
    AnillosServiceImpl anillosService;

    @Autowired
    CategoriaServiceImpl categoriaService;

    @GetMapping("/obtener")
    public List<AnillosDto> traerAnillos(){
        List<AnillosEntity> anillos = anillosService.traerAnillo();
        return anillos.stream()
                .map(this::mapToAnilloDTO)
                .collect(Collectors.toList());
    }

    private AnillosDto mapToAnilloDTO(AnillosEntity anillo) {
        AnillosDto anilloDTO = new AnillosDto();
        anilloDTO.setId(anillo.getId());
        anilloDTO.setNombre(anillo.getNombre());
        anilloDTO.setPrecio(anillo.getPrecio());
        anilloDTO.setDescripcion(anillo.getDescripcion());
        anilloDTO.setImagen(anillo.getImagen());

        // Mapear otros campos necesarios

        CategoriaDto categoriaDTO = new CategoriaDto();
        categoriaDTO.setId(anillo.getCategoriaAnillo().getId());
        categoriaDTO.setCategoria(anillo.getCategoriaAnillo().getNombreCategoria());
        // Mapear otros campos del usuario si es necesario
        anilloDTO.setCategoria(categoriaDTO);


        return anilloDTO;
    }

    @GetMapping("/obtener/{id}")
    public ResponseEntity<AnillosEntity> traerAnillosPorId(@PathVariable("id") Long id){
        AnillosEntity anilloElegido = anillosService.traerAnilloPorId(id);
        return ResponseEntity.ok((AnillosEntity) anilloElegido);
    }

    @PostMapping("/nuevo/{id}")
    public ResponseEntity<AnillosEntity> guardarAnillo(@RequestBody AnillosEntity nuevoAnillo,
                                                       @PathVariable Long id){

        CategoriaEntity categoriaElegida = categoriaService.buscarCategoriaId(id);
        nuevoAnillo.setCategoriaAnillo(categoriaElegida);
        return ResponseEntity.ok(anillosService.guardarAnillo(nuevoAnillo));
    }

    @PutMapping("editar/{id}")
    public ResponseEntity<AnillosEntity> editarAnillo(@PathVariable Long id, @RequestBody AnillosEntity personaje){
        return ResponseEntity.ok(this.anillosService.editarAnillo(id,personaje));
    }
}
