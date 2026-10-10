package com.ejemplo.categorias.exception;

public class CategoriaNoEncontradaException extends RuntimeException {

    public CategoriaNoEncontradaException(Long id) {
        super("No se encontró la categoría con id " + id);
    }
}
