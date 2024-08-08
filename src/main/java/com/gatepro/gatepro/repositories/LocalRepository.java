package com.gatepro.gatepro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gatepro.gatepro.models.Local;

@Repository
public interface LocalRepository extends JpaRepository<Local, Long> {
}