package com.grupo6.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

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

    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoriaAnillo;

    //@JsonManagedReference
    //@OneToMany(mappedBy = "anillosVenta", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //private List<AnillosEntity> ventaAnillos;
}
