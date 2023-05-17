package com.proyectoPrueba1.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyectoPrueba1.dao.UserRepository;
import com.proyectoPrueba1.entity.User;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public ArrayList<User> getUsers(){
		return (ArrayList<User>) userRepository.findAll();
	}
	
	public Optional<User> getUser(Integer id) {
		return userRepository.findById(id);
	}
	
	public boolean deleteUser(Integer id) {
		try {
			userRepository.deleteById(id);
			return true;
		}catch(Exception error) {
			return false;
		}
	}
	
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	public User addUser(User user) {
		return userRepository.save(user);
	}
}
