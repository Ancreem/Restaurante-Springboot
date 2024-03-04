package com.example.reto1.web.controller;


import com.example.reto1.models.Plato;
import com.example.reto1.services.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/platos")
@CrossOrigin("*")
public class PlatoController {
    private final PlatoService platoService;

    @Autowired

    public PlatoController(PlatoService platoService) {
        this.platoService = platoService;
    }

    @GetMapping
    public List<Plato> getAllPlatos(){
        return  platoService.getAllPlato();
    }

    @GetMapping("/{id}")
    public Plato getPlatoById(@PathVariable Long id){
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
