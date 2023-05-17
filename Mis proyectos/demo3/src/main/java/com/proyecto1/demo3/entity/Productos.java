package com.proyecto1.demo3.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class Productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_producto;
	
	private String nombreProducto;
	
	private String descripcion;
	
	private Integer cantidadStock;
	
	private BigDecimal precio;
	
	private Integer id_artista;


	public Integer getId_producto() {
		return id_producto;
	}

	public void setId_producto(Integer id_producto) {
		this.id_producto = id_producto;
	}
	
	

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	

	public Integer getId_artista() {
		return id_artista;
	}

	public void setId_artista(Integer id_artista) {
		this.id_artista = id_artista;
	}

	@Override
	public String toString() {
		return "Productos [id_producto=" + id_producto + ", nombreProducto=" + nombreProducto + ", descripcion="
				+ descripcion + ", cantidadStock=" + cantidadStock + ", precio=" + precio + "]";
	}
	
	
	

}
