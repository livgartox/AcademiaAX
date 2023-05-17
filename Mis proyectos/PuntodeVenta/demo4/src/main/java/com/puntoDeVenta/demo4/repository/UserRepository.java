package com.puntoDeVenta.demo4.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.puntoDeVenta.demo4.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
