package com.proyecto1.demo3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto1.demo3.entity.Artista;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Integer>{

	
}
