package com.curso.ecommerce.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.entity.Producto;
import com.curso.ecommerce.repository.ProductRepository;

@Service
public class ProductoServiceImp implements ProductService{

	@Autowired
	ProductRepository productRepository;
	 
	@Override
	public Producto save(Producto producto) {
		return productRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		return productRepository.findById(id);
	}

	@Override
	public void update(Producto producto) {
		productRepository.save(producto);
		
	}

	@Override
	public void delete(Integer id) {
		productRepository.deleteById(id);
		
	}

}
