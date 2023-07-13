package com.grupo6.demo.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = ("Anillos_venta"))
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Anillos_Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidadAnillos;
    private Integer precio_unitario;

    //@JsonBackReference
    //@ManyToOne
    //@JoinColumn(name = "anillo_id")
    //private CategoriaEntity anilloVenta;
}
