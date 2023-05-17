package com.example17042022.demo2.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example17042022.demo2.entity.Cliente;
import com.example17042022.demo2.repository.ClienteRepository;
@Service
public class ClienteService {
	@Autowired
	private ClienteRepository clienteRepository;
	
	public ArrayList<Cliente> obtenerUsuarios(){
		return (ArrayList<Cliente>) clienteRepository.findAll();
	}
	
	
}
