package com.mundoDisney.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mundoDisney.repository.PeliculaSerieRepository;
import com.mundoDisney.service.PeliculaSerieService;

@Service
public class PeliculaSerieServiceImpl implements PeliculaSerieService {
	@Autowired
	private PeliculaSerieRepository PeliculaSerieRepository;
	@Override
	public void get() {
		PeliculaSerieRepository.findById(1);
	}
		

	
}
