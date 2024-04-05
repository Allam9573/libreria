package com.libreria.libreria.repositories;

import org.springframework.data.repository.CrudRepository;

import com.libreria.libreria.entities.Libro;

public interface LibroRepository extends CrudRepository<Libro, String> {

    public Libro findByTitulo(String titulo);

}
