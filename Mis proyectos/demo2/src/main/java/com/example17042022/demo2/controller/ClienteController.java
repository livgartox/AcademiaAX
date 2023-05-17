package com.example17042022.demo2.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example17042022.demo2.entity.Cliente;
import com.example17042022.demo2.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/todos")
	public ArrayList<Cliente> obtenertodos(){
		return clienteService.obtenerUsuarios();
	}
	
}
