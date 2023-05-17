package com.proyecto1.demo3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="artistas")
public class Artista {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_artista;
	private String nombre_artista;
	private String correo_artista;
	public Integer getId_artista() {
		return id_artista;
	}
	public void setId_artista(Integer id_artista) {
		this.id_artista = id_artista;
	}
	public String getNombre_artista() {
		return nombre_artista;
	}
	public void setNombre_artista(String nombre_artista) {
		this.nombre_artista = nombre_artista;
	}
	public String getCorreo_artista() {
		return correo_artista;
	}
	public void setCorreo_artista(String correo_artista) {
		this.correo_artista = correo_artista;
	}
	
	
	
	

}
