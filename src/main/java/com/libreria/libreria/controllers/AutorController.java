package com.libreria.libreria.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libreria.libreria.entities.Autor;

@RestController
@RequestMapping("/api/autores")
public class AutorController {

    @GetMapping({ "", "/" })
    public List<Autor> autores() {
        return null;
    }

}
