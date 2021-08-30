package com.mundoDisney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mundoDisney.model.PeliculaSerie;

@Repository
public interface PeliculaSerieRepository extends JpaRepository <PeliculaSerie, Integer> {
	
}
