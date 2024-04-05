package com.libreria.libreria.services;

import java.util.List;

import com.libreria.libreria.entities.Editorial;

public interface EditorialService {

    public Editorial crearEditorial(Editorial editorial);

    public List<Editorial> editoriales();

    public Editorial buscarNombre(String nombre);

    public List<Editorial> buscarPorPais(String pais);
}
