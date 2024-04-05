package com.libreria.libreria.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "autores")
public class Autor {

    @Id
    private String dni;
    private String nombre;
    private String apellido;
    private String correo;

    @ManyToMany
    @JoinTable(name = "libro_autor", joinColumns = @JoinColumn(name = "dni"), inverseJoinColumns = @JoinColumn(name = "isbn"))
    private List<Libro> libros;

}
