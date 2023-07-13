package com.grupo6.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AnillosDto {
    private Long id;
    // Otros campos necesarios
    private CategoriaDto categoria;
    private String nombre;
    private String descripcion;
    private String imagen;
    private Integer Precio;
}
