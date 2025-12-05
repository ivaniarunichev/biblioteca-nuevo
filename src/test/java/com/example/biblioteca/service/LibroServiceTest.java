package com.example.biblioteca.service;

import com.example.biblioteca.entity.Libro;
import com.example.biblioteca.repository.LibroRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LibroServiceTest {
    @Mock
    LibroRepository libroRepository;

    @InjectMocks
    LibroServicesImpl services;

    @Test
    public void testGetLibro(){
        Libro libroEsperado = new Libro(1L, "titulo1", "autor1");
        Mockito.when(this.libroRepository.findById(1L)).thenReturn(Optional.of(libroEsperado));
        Optional<Libro> resultado = services.getLibro(1L);
        resultado.ifPresent(libro -> assertEquals(libroEsperado, libro));
    }
}
