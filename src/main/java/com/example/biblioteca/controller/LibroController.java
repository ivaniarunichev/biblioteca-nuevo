package com.example.biblioteca.controller;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.service.LibroService;
import com.example.biblioteca.service.LibroServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api")
public class LibroController {
    @Autowired
    private LibroServicesImpl libroServiceImpl; //Se inyecta la dependencia

    @GetMapping
    public List<Libro> obtenerTodos(){
        return this.libroServiceImpl.getLibros();
    }

    @GetMapping("/{id}")
    public Optional<Libro> getLibro(@PathVariable Long id){
        return this.libroServiceImpl.getLibro(id);
    }

    @PostMapping
    void guardarOACtualizarLibro(@RequestBody Libro libro){
        this.libroServiceImpl.guardarOActualizarLibro(libro);
    }

    @DeleteMapping("/{id}")
    public void eliminarLibro(@PathVariable Long id) {
        libroServiceImpl.eliminarLibro(id);
    }
}
