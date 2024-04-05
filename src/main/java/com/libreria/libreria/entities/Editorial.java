package com.libreria.libreria.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "editoriales")
public class Editorial {

    @Id
    @Column(name = "id_editorial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEditorial;
    private String nombre;
    private String pais;
    private String correo;

    @OneToMany(mappedBy = "editorial")
    private List<Libro> libros;

}
