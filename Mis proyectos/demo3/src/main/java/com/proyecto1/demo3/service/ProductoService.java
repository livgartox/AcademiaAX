package com.proyecto1.demo3.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto1.demo3.entity.Productos;
import com.proyecto1.demo3.repository.ProductosRepository;

@Service
public class ProductoService {
	@Autowired
	ProductosRepository productoRepository;

	public ArrayList<Productos> findAllProductos(){
		return (ArrayList<Productos>) productoRepository.findAll();
	}
	
	public Optional<Productos> findIdProductos(Integer id) {
		return productoRepository.findById(id);
	}
	
	public Productos agregarProductos(Productos producto) {
		return productoRepository.save(producto);
	}
	
	public Productos actualizarProductos(Productos producto) {
		return productoRepository.save(producto);
	}
	
	public String eliminarProducto(Integer id) {
		try {
			productoRepository.deleteById(id);
			return "El producto con id "+id+" fue eliminado";
		} catch (Exception e) {
			return "El producto con id"+id+" no fue encontrado";
		}
		
	}
	
}
