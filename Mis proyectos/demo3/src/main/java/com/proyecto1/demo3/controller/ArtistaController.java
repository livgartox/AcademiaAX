package com.proyecto1.demo3.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto1.demo3.entity.Artista;
import com.proyecto1.demo3.service.ArtistaService;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {
	@Autowired
	ArtistaService artistaService;
	
	@GetMapping("/todos")
	public ArrayList<Artista> getAllArtistas(){
		return artistaService.findAllArtistas();
	}

	@PostMapping("/agregar")
	public Artista agregarArtista(@RequestBody Artista artista) {
		return artistaService.agregarArtista(artista);
	}
}
