package com.gatepro.gatepro.models;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Usuario {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(nullable = false)
   private String nome;

   @Column(nullable = false, unique = true)
   private String matricula;

   @Column(nullable = false)
   private String senha;

   @Column(nullable = true)
   private String cargo;

   @Column(nullable = false, unique = true)
   private String email;

   @OneToMany(mappedBy = "usuario")
   private List<Evento> eventos;

   @OneToMany(mappedBy = "usuario")
   private List<Permissao> permissoes;

   public Usuario() {
   }

   public Usuario(String nome, String matricula, String senha, String cargo, String email) {
      this.nome = nome;
      this.matricula = matricula;
      this.senha = senha;
      this.cargo = cargo;
      this.email = email;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getMatricula() {
      return matricula;
   }

   public void setMatricula(String matricula) {
      this.matricula = matricula;
   }

   public String getSenha() {
      return senha;
   }

   public void setSenha(String senha) {
      this.senha = senha;
   }

   public String getCargo() {
      return cargo;
   }

   public void setCargo(String cargo) {
      this.cargo = cargo;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public List<Evento> getEventos() {
      return eventos;
   }

   public void setEventos(List<Evento> eventos) {
      this.eventos = eventos;
   }

   public List<Permissao> getPermissoes() {
      return permissoes;
   }

   public void setPermissoes(List<Permissao> permissoes) {
      this.permissoes = permissoes;
   }

}