package com.mundoDisney.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mundoDisney.repository.GeneroRepository;
import com.mundoDisney.service.GeneroService;


@Service
public class GeneroServiceImpl implements GeneroService {
		@Autowired
		private GeneroRepository GeneroRepository;
		@Override
		public void get() {
			GeneroRepository.findById(1);
		}
	
}
