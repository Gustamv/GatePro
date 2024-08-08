package com.gatepro.gatepro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatepro.gatepro.models.Local;
import com.gatepro.gatepro.repositories.LocalRepository;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository;

    public List<Local> findAll() {
        return localRepository.findAll();
    }

    public Local findById(Long id) {
        return localRepository.findById(id).orElseThrow();
    }

    public Local save(Local local) {
        return localRepository.save(local);
    }

    public void delete(Long id) {
        localRepository.deleteById(id);
    }
}
