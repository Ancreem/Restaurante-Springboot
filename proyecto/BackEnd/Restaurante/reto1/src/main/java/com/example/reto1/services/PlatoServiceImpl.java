package com.example.reto1.services;

import com.example.reto1.models.Plato;
import com.example.reto1.repositories.PlatoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoServiceImpl implements PlatoService{
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
    public void updatePlato(Plato plato) {
        Optional<Plato> optionalPlato = platoRepository.findById(plato.getId());

        if (optionalPlato.isPresent()) {
            Plato platoToUpdate = optionalPlato.get();
            platoToUpdate.setNombre(plato.getNombre());
            platoToUpdate.setDescripcion(plato.getDescripcion());
            platoToUpdate.setPrecio(plato.getPrecio());

            platoRepository.save(platoToUpdate);
            System.out.println("¡¡ Plato actualizado !!");
        } else {
            throw new Error("Plato no encontrado con ID " + plato.getId());
        }
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
}
