package com.curso.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.entity.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Integer> {

}
