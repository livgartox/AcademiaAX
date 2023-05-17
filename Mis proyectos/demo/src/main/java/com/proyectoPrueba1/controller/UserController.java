package com.proyectoPrueba1.controller;

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

import com.proyectoPrueba1.entity.User;
import com.proyectoPrueba1.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/users")
	public ArrayList<User> obtenerUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/{id}")
	public Optional<User> obtenerUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}
	

	@PostMapping("/agregarUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/editarUser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String deleteUser(@PathVariable Integer id) {
		boolean ok=this.userService.deleteUser(id);
		if (ok) {
			return "sé eliminó el usuario con id "+id;
		}else {
			return "no se pudo eliminar al usuario "+id;
		}
	}
}
