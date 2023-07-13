package com.grupo6.demo.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "categorias")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreCategoria;

    @JsonManagedReference
    @OneToMany(mappedBy = "categoriaAnillo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<AnillosEntity> anillosCategoria;

}
