package com.libreria.libreria.entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "libros")
public class Libro {

    @Id
    private String isbn;
    private String titulo;
    @Column(name = "anio_publicacion")
    private LocalDate anioPublicacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_editorial", referencedColumnName = "id_editorial")
    private Editorial editorial;

    @ManyToMany(mappedBy = "libros")
    private List<Autor> autores;

}
