package com.gatepro.gatepro.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = true)
    private String descricao;

    @Column(nullable = false)
    private String endereco;

    @OneToMany(mappedBy = "local")
    private List<Evento> eventos;

    // Constructor
    public Local(String nome, String descricao, String endereco) {
        this.nome = nome;
        this.descricao = descricao;
        this.endereco = endereco;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}