package com.puntoDeVenta.demo4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.puntoDeVenta.demo4.entity.User_Product;
import com.puntoDeVenta.demo4.repository.Usuario_ProductoRepository;

@Service
public class User_ProductService {
	@Autowired
	Usuario_ProductoRepository usuario_ProductoRepository;
	
	@Autowired
	ProductService productService;
	
	public Iterable<User_Product> getAll() {
		return usuario_ProductoRepository.findAll();
	}
	
	public Optional<User_Product> getComprasById(Integer id) {
		return usuario_ProductoRepository.findById(id);
	}
	
	public User_Product addCompras(User_Product u) {
		//necesitamos acceder a la cantidad de los productos
//		Optional<Product> p=productService.getProductById(u.getId());
		return usuario_ProductoRepository.save(u);
	}

	
	public User_Product editCompras(User_Product uP) {
		return usuario_ProductoRepository.save(uP);
	}
	
	public boolean deleteCompras(@PathVariable Integer id) {
		try {
			usuario_ProductoRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	public Integer stockProducto(Integer idProducto) {
		return productService.obtenerStockProducto(idProducto);
	}
}
