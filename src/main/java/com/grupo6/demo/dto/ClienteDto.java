package com.grupo6.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;
    private String rut;
    private String direccion;
    private String region;
}
