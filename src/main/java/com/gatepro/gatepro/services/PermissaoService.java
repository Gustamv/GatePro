package com.gatepro.gatepro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatepro.gatepro.models.Permissao;
import com.gatepro.gatepro.repositories.PermissaoRepository;

@Service
public class PermissaoService {

    @Autowired
    private PermissaoRepository permissaoRepository;

    public List<Permissao> findAll() {
        return permissaoRepository.findAll();
    }

    public Permissao findById(Long id) {
        return permissaoRepository.findById(id).orElseThrow();
    }

    public Permissao save(Permissao permissao) {
        return permissaoRepository.save(permissao);
    }

    public void delete(Long id) {
        permissaoRepository.deleteById(id);
    }
}
