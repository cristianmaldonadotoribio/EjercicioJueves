package com.example.examen.service;

import java.util.List;

import com.example.examen.entity.Libro;

public interface LibroService {
    
    public List<Libro> listaLibro();

    public List<Libro> listarLibrosPorCategoria(String categoria);
}
