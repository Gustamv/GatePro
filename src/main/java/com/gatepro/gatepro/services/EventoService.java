package com.gatepro.gatepro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatepro.gatepro.models.Evento;
import com.gatepro.gatepro.repositories.EventoRepository;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public Evento findById(Long id) {
        return eventoRepository.findById(id).orElseThrow();
    }

    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    public void delete(Long id) {
        eventoRepository.deleteById(id);
    }
}
