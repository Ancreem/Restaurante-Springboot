package com.example.restaurante.domain.service;

import com.example.restaurante.domain.repository.PlatoRepository;
import com.example.restaurante.persistence.entity.Plato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoServiceImpl implements PlatoService {
    private final PlatoRepository platoRepository;

    public PlatoServiceImpl(PlatoRepository platoRepository) {
        this.platoRepository = platoRepository;
    }


    @Override
    public List<Plato> getAllPlato() {
        return platoRepository.findAll();
    }

    @Override
    public Plato getPlatoById(Long id) {
        Optional<Plato> optionalPlato = platoRepository.findById(id);

        if (optionalPlato.isPresent()){
            return optionalPlato.get();
        } else {
            throw new Error("Plato no encontrado con ID " + id);
        }
    }

    @Override
    public Plato savePlato(Plato plato) {
        platoRepository.save(plato);
        System.out.printf("¡¡ Plato guardado !!");
        return plato;
    }


    @Override
    public void deletePlato(Long id) {
        Optional<Plato> optionalPlato = platoRepository.findById(id);

        if (optionalPlato.isPresent()) {
            platoRepository.deleteById(id);
            System.out.println("¡¡ Plato eliminado !!");
        } else {
            throw new Error("Plato no encontrado con ID " + id);
        }
    }

    @Override
    public void updatePlato(long id, Plato plato) {
        Plato platoEnviar = platoRepository.findById(id).orElse(null);

        platoEnviar.setImagen(plato.getImagen());
        platoEnviar.setNombre(plato.getNombre());
        platoEnviar.setDescripcion(plato.getDescripcion());
        platoEnviar.setPrecio(plato.getPrecio());

        platoRepository.save(platoEnviar);
        System.out.println("El plato ha sido actualizado con exito.");
    }
}
