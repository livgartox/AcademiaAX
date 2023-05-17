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

import com.puntoDeVenta.demo4.entity.User;
import com.puntoDeVenta.demo4.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@GetMapping("/all")
	public Iterable<User> getAllUser() {
		return userService.findAllUser();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getUser(@PathVariable Integer id) {
		return userService.findUserById(id);
	}
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@PutMapping("/edit")
	public User editUser(@RequestBody User user) {
		return userService.editUser(user);
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteUser(@PathVariable Integer id) {
		return userService.deleteUser(id);
	}
}
