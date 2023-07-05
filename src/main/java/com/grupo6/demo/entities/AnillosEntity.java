package com.grupo6.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "anillos")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class AnillosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String imagen;
    private Integer Precio;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoriaAnillo;
}
