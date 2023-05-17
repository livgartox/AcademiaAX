package com.example17042022.demo2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example17042022.demo2.entity.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Integer>{
	
}
