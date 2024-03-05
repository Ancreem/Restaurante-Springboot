package com.example.restaurante.domain.repository;

import com.example.restaurante.persistence.entity.Plato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlatoRepository extends JpaRepository<Plato, Long> {
}