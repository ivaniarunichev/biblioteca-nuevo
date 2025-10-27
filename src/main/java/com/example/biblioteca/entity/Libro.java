package com.example.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Evita definir los getters y setters
@Entity
@NoArgsConstructor
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Se generará de forma automatica
    private long id;

    @Column(nullable = false) //Al ponerlo a posterior, hay que modificar la propiedad
    private String titulo;

    @Column
    private String autor;
}
