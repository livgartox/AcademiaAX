package com.proyectoPrueba1.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyectoPrueba1.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
