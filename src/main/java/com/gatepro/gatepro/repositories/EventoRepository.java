package com.gatepro.gatepro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gatepro.gatepro.models.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}