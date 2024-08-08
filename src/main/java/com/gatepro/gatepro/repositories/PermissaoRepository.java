package com.gatepro.gatepro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gatepro.gatepro.models.Permissao;

@Repository
public interface PermissaoRepository extends JpaRepository<Permissao, Long> {
}