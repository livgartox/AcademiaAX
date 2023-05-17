package com.puntoDeVenta.demo4.entity;




import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ventas")
public class User_Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(nullable=false,name="id_usuario")
	@JsonProperty(access=Access.WRITE_ONLY)
	private User idUser1;
	
	@ManyToOne
	@JoinColumn(nullable=false,name="id_producto")
	@JsonProperty(access=Access.WRITE_ONLY)
	private Product idProducto1;
	
	private Integer cantidad;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public User getIdUser1() {
		return idUser1;
	}

	public void setIdUser1(User idUser1) {
		this.idUser1 = idUser1;
	}

	public Product getIdProducto1() {
		return idProducto1;
	}

	public void setIdProducto1(Product idProducto1) {
		this.idProducto1 = idProducto1;
	}

	
	
	
	
	

}
