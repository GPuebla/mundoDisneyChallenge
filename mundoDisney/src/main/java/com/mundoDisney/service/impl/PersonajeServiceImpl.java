package com.mundoDisney.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mundoDisney.repository.PersonajeRepository;
import com.mundoDisney.service.PersonajeService;

@Service
public class PersonajeServiceImpl implements PersonajeService{
	@Autowired
	private PersonajeRepository PersonajeRepository;
	@Override
	public void get() {
		PersonajeRepository.findById(1);
	}
}