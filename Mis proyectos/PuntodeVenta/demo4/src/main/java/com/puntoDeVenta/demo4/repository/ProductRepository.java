package com.puntoDeVenta.demo4.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.puntoDeVenta.demo4.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	
	@Query(value="SELECT stock FROM productos WHERE id=?",nativeQuery=true)
	Integer getStockById(Integer idProducto);
}
