package com.libreria.libreria.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.libreria.entities.Editorial;
import com.libreria.libreria.services.impl.EditorialServiceImpl;

@RestController
@RequestMapping("/api/editoriales")
public class EditorialController {

    @Autowired
    private EditorialServiceImpl editorialServiceImpl;

    @GetMapping({ "", "/" })
    public List<Editorial> editoriales() {
        return this.editorialServiceImpl.editoriales();
    }

    @PostMapping("/crear")
    public Editorial nuevaEditorial(@RequestBody Editorial editorial) {
        return this.editorialServiceImpl.crearEditorial(editorial);
    }

    @GetMapping("/search")
    public Editorial buscarPorNombre(@RequestParam String titulo) {
        return this.editorialServiceImpl.buscarNombre(titulo);
    }

    @GetMapping("/pais")
    public List<Editorial> buscarPorPais(@RequestParam String p) {
        return this.editorialServiceImpl.buscarPorPais(p);
    }
}
