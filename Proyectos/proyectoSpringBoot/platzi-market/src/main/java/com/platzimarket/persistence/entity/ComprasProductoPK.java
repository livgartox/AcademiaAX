package com.platzimarket.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

//Porque la vamos a embeber
@Embeddable
public class ComprasProductoPK implements Serializable{
	
	@Column(name = "id_compra")
	public Integer idCompra;
	
	
	@Column(name = "id_producto")
	public Integer idProducto;


	public Integer getIdCompra() {
		return idCompra;
	}


	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}


	public Integer getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}
	
	
	
}
