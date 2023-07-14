package com.grupo6.demo.entities;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "venta")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class VentaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date fecha;
    private Date hora;
    private Integer total;
    private Boolean status;

    @JsonManagedReference
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "cliente_id")
    private ClienteEntity clienteVenta;

}
