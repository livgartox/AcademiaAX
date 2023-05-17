package com.puntoDeVenta.demo4.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer idProducto;
	
	@Column(name="nombre")
	private String nameProducto;
	
	@Column(name="precio")
	private Float price;
	
	@Column(name="stock")
	private Integer stock;
	
	
	@OneToMany(mappedBy="idProducto1")
	private List<User_Product> productosypedidos;
	
	
	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNameProducto() {
		return nameProducto;
	}

	public void setNameProducto(String nameProducto) {
		this.nameProducto = nameProducto;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}


}
