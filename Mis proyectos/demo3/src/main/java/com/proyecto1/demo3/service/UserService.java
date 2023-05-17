package com.proyecto1.demo3.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.proyecto1.demo3.entity.InfoUser;
import com.proyecto1.demo3.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	
	//ver usuarios
	public ArrayList<InfoUser> getUsers() {
		return (ArrayList<InfoUser>) userRepository.findAll();
	}
	
	//ver un usuario
	public InfoUser getUser(Integer id) {
		Optional<InfoUser> user=userRepository.findById(id);
		return user.orElse(null);
	}

	//agregar a un usuario
	public InfoUser addUser(InfoUser infoUser) {
		return userRepository.save(infoUser);
	}
	
	//actualizar usuario
	public InfoUser updateUser(InfoUser infoUser) {
		return userRepository.save(infoUser);
	}
	
	//eliminar
	@DeleteMapping("/eliminarUser/{id]")
	public boolean eliminarUser(Integer id) {
		try {
			userRepository.deleteById(id);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
