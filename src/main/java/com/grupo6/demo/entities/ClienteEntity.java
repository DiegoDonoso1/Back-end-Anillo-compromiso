package com.grupo6.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private Integer telefono;
    private String rut;
    private String direccion;
    private String region;

    @JsonManagedReference
    @OneToMany(mappedBy = "clienteVenta", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<VentaEntity> ventaCliente;

}
