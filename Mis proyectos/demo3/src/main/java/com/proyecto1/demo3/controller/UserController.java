package com.proyecto1.demo3.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto1.demo3.entity.InfoUser;
import com.proyecto1.demo3.service.UserService;

@RestController
@RequestMapping("/infoUsers")
@CrossOrigin(origins = "*")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/verTodos")
	public ArrayList<InfoUser> getAllUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/verUsuario/{id}")
	public InfoUser getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}
	
	@PostMapping("/agregarUsuario")
	public InfoUser agregarUser(@RequestBody InfoUser infoUser) {
		return userService.addUser(infoUser);
	}
	
	@PutMapping("/editarUsuario")
	public InfoUser editarUser(@RequestBody InfoUser infoUser) {
		return userService.updateUser(infoUser);
	}
	
	@DeleteMapping("/eliminarUsuario/{id}")
	public boolean eliminar(@PathVariable Integer id) {
		return userService.eliminarUser(id);
	}

}
