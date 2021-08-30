package com.mundoDisney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mundoDisney.model.Personaje;

@Repository
public interface PersonajeRepository extends JpaRepository <Personaje, Integer> {
	
}
