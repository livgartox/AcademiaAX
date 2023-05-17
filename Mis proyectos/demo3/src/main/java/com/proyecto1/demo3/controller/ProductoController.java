package com.proyecto1.demo3.controller;

import java.util.ArrayList;
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

import com.proyecto1.demo3.entity.Productos;
import com.proyecto1.demo3.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
	@Autowired
	ProductoService productoService;
	
	@GetMapping("/todos")
	public ArrayList<Productos> findAllProductos(){
		return productoService.findAllProductos();
		}
	
	@GetMapping("/producto/{id}")
	public Optional<Productos> finById(@PathVariable Integer id){
		return productoService.findIdProductos(id);
	}
	
	@PostMapping("/agregar")
	public Productos agregarProductos(@RequestBody Productos p) {
		return productoService.agregarProductos(p);
	}
	
	@PutMapping("/editar")
	public Productos editarProductos(@RequestBody Productos p) {
		return productoService.actualizarProductos(p);
	}

	@DeleteMapping("/eliminar/{id}")
	public String eliminarProducto(@PathVariable Integer id) {
		return productoService.eliminarProducto(id);
	}
}
