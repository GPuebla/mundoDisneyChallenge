package com.mundoDisney.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mundoDisney.model.Genero;

@Repository
public interface GeneroRepository extends JpaRepository <Genero, Integer> {

}
