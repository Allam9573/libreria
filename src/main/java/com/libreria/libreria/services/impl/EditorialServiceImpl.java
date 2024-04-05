package com.libreria.libreria.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.libreria.libreria.entities.Editorial;
import com.libreria.libreria.repositories.EditorialRepository;
import com.libreria.libreria.services.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService {

    @Autowired
    private EditorialRepository editorialRepository;

    @Override
    public Editorial crearEditorial(Editorial editorial) {
        return this.editorialRepository.save(editorial);
    }

    @Override
    public List<Editorial> editoriales() {
        return (List<Editorial>) this.editorialRepository.findAll();
    }

    @Override
    public Editorial buscarNombre(String nombre) {
        return this.editorialRepository.findByNombre(nombre);
    }

    @Override
    public List<Editorial> buscarPorPais(String pais) {
        return this.editorialRepository.findByPais(pais);
    }

}
