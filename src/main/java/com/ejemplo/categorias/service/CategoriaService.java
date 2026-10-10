package com.ejemplo.categorias.service;

import com.ejemplo.categorias.exception.CategoriaNoEncontradaException;
import com.ejemplo.categorias.model.Categoria;
import com.ejemplo.categorias.repository.CategoriaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoriaService {

    private final CategoriaRepository repository;

    public CategoriaService(CategoriaRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true)
    public List<Categoria> listar() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Categoria obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new CategoriaNoEncontradaException(id));
    }

    public Categoria crear(Categoria categoria) {
        categoria.setId(null);
        return repository.save(categoria);
    }

    public Categoria actualizar(Long id, Categoria datos) {
        Categoria existente = obtenerPorId(id);
        existente.setNombre(datos.getNombre());
        existente.setDescripcion(datos.getDescripcion());
        return repository.save(existente);
    }

    public void eliminar(Long id) {
        Categoria existente = obtenerPorId(id);
        repository.delete(existente);
    }
}
