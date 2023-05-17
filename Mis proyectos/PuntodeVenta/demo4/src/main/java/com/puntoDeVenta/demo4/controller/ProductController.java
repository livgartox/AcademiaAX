package com.puntoDeVenta.demo4.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puntoDeVenta.demo4.entity.Product;
import com.puntoDeVenta.demo4.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/all")
	public Iterable<Product> getAllProducts() {
		return productService.GetAllProducts();
	}
	
	@GetMapping("/get/{id}")
	public Optional<Product> getProductById(@PathVariable Integer id) {
		return productService.getProductById(id);
	}
	
	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}
	
	@PutMapping("/edit")
	public Product editProduct(@RequestBody Product product) {
		return productService.ediProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteProduct(@PathVariable Integer id) {
		return productService.deleteProduct(id);
	}
	
	@GetMapping("/cantidad/{id}")
	public Integer obtenerStockProducto(@PathVariable Integer id) {
		return productService.obtenerStockProducto(id);
	}
}
