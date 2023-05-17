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
import com.puntoDeVenta.demo4.entity.User_Product;
import com.puntoDeVenta.demo4.service.ProductService;
import com.puntoDeVenta.demo4.service.User_ProductService;

@RestController
@RequestMapping("/user_product")
public class User_ProductController {
	@Autowired
	User_ProductService user_ProductService; 
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/all")
	public Iterable<User_Product> getAll() {
		return user_ProductService.getAll();
	}
	
	@GetMapping("/get/{id}")
	public Optional<User_Product> getCompras(@PathVariable Integer id) {
		return user_ProductService.getComprasById(id);
	}
	
	
	
	
	@PostMapping("/add")
	public User_Product addProduct(@RequestBody User_Product u) {
		Integer id=(u.getIdProducto1()).getIdProducto();
		if(productService.obtenerStockProducto((u.getIdProducto1()).getIdProducto())>0) {
//			(u.getIdProducto1()).setStock((u.getIdProducto1()).getStock()-1);
			System.out.println("Yes si se pudo");
			Optional<Product> p=productService.getProductById(id);
			p.get().setStock(p.get().getStock()-1);
			
		}
		else {
			System.out.println("Sorry, no se puede");
		}
		return user_ProductService.addCompras(u);
		
	}
	
	@PutMapping("/edit")
	public User_Product edit(@RequestBody User_Product uP) {
		return user_ProductService.editCompras(uP);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteProduct(@PathVariable Integer id) {
		return user_ProductService.deleteCompras(id);
	}
}
