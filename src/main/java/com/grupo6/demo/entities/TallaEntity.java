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
@Table(name = "Tallas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TallaEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tallaId;
    private Integer numeroTalla;
    private Integer stock;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "id")
    private AnillosEntity anilloTalla;









}
