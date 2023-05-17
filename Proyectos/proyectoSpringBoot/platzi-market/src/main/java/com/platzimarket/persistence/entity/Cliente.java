package com.platzimarket.persistence.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Integer idCliente;
	
	private String nombre;
	
	private String apellido;
	
	private Integer celular;
	
	private String direccion;
	
	@Column(name="correo_electronico")
	public String correoElectronico;
	
	@OneToMany(mappedBy = "cliente")
	private List<Compra> compras;
	

}
