package com.example.restaurante.domain.service;

import com.example.restaurante.persistence.entity.Plato;

import java.util.List;

public interface PlatoService {
    List<Plato> getAllPlato();
    Plato getPlatoById(Long id);
    Plato savePlato(Plato plato);
    void deletePlato(Long id);
    void updatePlato(long id, Plato plato);
}
