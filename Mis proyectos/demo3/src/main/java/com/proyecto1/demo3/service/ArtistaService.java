package com.proyecto1.demo3.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto1.demo3.entity.Artista;
import com.proyecto1.demo3.repository.ArtistaRepository;

@Service
public class ArtistaService {
	
	@Autowired
	ArtistaRepository artistaRepository;
	
	public ArrayList<Artista> findAllArtistas(){
		return (ArrayList<Artista>) artistaRepository.findAll();
	}
	
	public Artista agregarArtista(Artista artista) {
		return artistaRepository.save(artista);
	}

}
