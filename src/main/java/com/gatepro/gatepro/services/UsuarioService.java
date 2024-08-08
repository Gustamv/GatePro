package com.gatepro.gatepro.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatepro.gatepro.models.Usuario;
import com.gatepro.gatepro.repositories.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario update(Usuario usuario) {
        Usuario usuarioExistente = findById(usuario.getId());
        if (usuarioExistente != null) {
            usuarioExistente.setNome(usuario.getNome());
            usuarioExistente.setEmail(usuario.getEmail());
            // atualize outros campos se necessário
            return save(usuarioExistente);
        } else {
            throw new RuntimeException("Usuário não encontrado");
        }
    }

    public void delete(Long id) {
        usuarioRepository.deleteById(id);
    }
}