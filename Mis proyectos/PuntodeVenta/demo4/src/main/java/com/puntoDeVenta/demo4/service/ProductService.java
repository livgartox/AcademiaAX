package com.puntoDeVenta.demo4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntoDeVenta.demo4.entity.Product;
import com.puntoDeVenta.demo4.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository productRepository;
	
	public Iterable<Product> GetAllProducts() {
		return productRepository.findAll();
	}
	
	public Optional<Product> getProductById(Integer id) {
		return productRepository.findById(id);
	}
	
	//agregar producto
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	
	//editar producto
	public Product ediProduct(Product product) {
		return productRepository.save(product);
	}
	
	//eliminar producto
	public boolean deleteProduct(Integer id) {
		try {
			productRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Integer obtenerStockProducto(Integer idProducto) {
		return productRepository.getStockById(idProducto);
	}
}
