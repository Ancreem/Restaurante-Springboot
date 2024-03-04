package com.example.reto1.services;

import com.example.reto1.models.Plato;

import java.util.List;

public interface PlatoService {
    List<Plato> getAllPlato();
    Plato getPlatoById(Long id);
    Plato savePlato(Plato plato);
    void updatePlato(Plato plato);
    void deletePlato(Long id);

}
