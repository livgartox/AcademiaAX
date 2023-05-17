package com.puntoDeVenta.demo4.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.puntoDeVenta.demo4.entity.User_Product;

@Repository
public interface Usuario_ProductoRepository extends CrudRepository<User_Product, Integer>{

}
