package com.example.restaurante.web.controller;

import com.example.restaurante.domain.service.PlatoService;
import com.example.restaurante.persistence.entity.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/plato")
public class PlatoController {
    private final PlatoService platoService;

    @Autowired
    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    public List<Plato> getAllPlato() {
        return platoService.getAllPlato();
    }

    @PutMapping("/{id}")
    public void updatePlato(@PathVariable Long id, @RequestBody Plato plato){
        platoService.updatePlato(id, plato);
    }

    @GetMapping("/{id}")
    public Plato getPlatoById(@PathVariable Long id) {
        return platoService.getPlatoById(id);
    }

    @PostMapping
    public Plato savePlato(@RequestBody Plato plato) {
        return platoService.savePlato(plato);
    }

    @DeleteMapping("/{id}")
    public void deletePlato(@PathVariable Long id) {
        platoService.deletePlato(id);
    }
}
