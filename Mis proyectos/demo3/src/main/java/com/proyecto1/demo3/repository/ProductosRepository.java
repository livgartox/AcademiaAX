package com.proyecto1.demo3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto1.demo3.entity.Productos;

@Repository
public interface ProductosRepository extends CrudRepository<Productos, Integer> {
	

}
