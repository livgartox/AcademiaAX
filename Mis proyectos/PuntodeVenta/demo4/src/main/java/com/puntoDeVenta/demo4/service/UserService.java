package com.puntoDeVenta.demo4.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puntoDeVenta.demo4.entity.User;
import com.puntoDeVenta.demo4.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	
	public Iterable<User> findAllUser() {
		return userRepository.findAll();
	}
	
	//obtener solo a 1 usuario
	public Optional<User> findUserById(Integer id) {
		return userRepository.findById(id);
	}
	
	
	//agregar un usuario
	public User addUser(User user) {
		return userRepository.save(user);
	}
	
	//editar un user
	public User editUser(User user) {
		return userRepository.save(user);
	}
	
	//eliminarUser
	public boolean deleteUser(Integer id) {
		try {
			userRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	

}
