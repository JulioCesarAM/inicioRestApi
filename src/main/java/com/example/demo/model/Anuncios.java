package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity(name="anuncios")
@Table(name = "anuncios")
public class Anuncios {
	String cod_anuncio;
	String titulo_anuncio;
	int cod_usuario;
	String descripcion_anuncio;
	String ubicacion;
	String localidad;
	int precio;

	public Anuncios() {
		super();
	}
	@Id
	public String getCod_anuncio() {
		return cod_anuncio;
	}

	public void setCod_anuncio(String cod_anuncio) {
		this.cod_anuncio = cod_anuncio;
	}

	public String getTitulo_anuncio() {
		return titulo_anuncio;
	}

	public void setTitulo_anuncio(String titulo_anuncio) {
		this.titulo_anuncio = titulo_anuncio;
	}

	public int getCod_usuario() {
		return cod_usuario;
	}

	public void setCod_usuario(int cod_usuario) {
		this.cod_usuario = cod_usuario;
	}



	public String getDescripcion_anuncio() {
		return descripcion_anuncio;
	}

	public void setDescripcion_anuncio(String descripcion_anuncio) {
		this.descripcion_anuncio = descripcion_anuncio;
	}


	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	

	
	

}