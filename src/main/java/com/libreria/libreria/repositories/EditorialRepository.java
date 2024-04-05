package com.libreria.libreria.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.libreria.libreria.entities.Editorial;

public interface EditorialRepository extends CrudRepository<Editorial, Integer> {

    public Editorial findByNombre(String nombre);

    public List<Editorial> findByPais(String pais);

}
