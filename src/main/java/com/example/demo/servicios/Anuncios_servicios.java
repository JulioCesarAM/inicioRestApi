package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.error.ProductNotFoundException;
import com.example.demo.model.Anuncios;
import com.example.demo.repositorios.Anuncios_repositorio;
@Service
public class Anuncios_servicios {
	@Autowired
	private Anuncios_repositorio repositorioAnuncios;
	public List<Anuncios> mostrarEquipos(){
		return repositorioAnuncios.findAll();
	}
	public Anuncios mostrarEquiposId(Integer _id) {
		return repositorioAnuncios.findById(_id).orElseThrow(()->new ProductNotFoundException(_id));
	}
//	public Anuncios guardarEquipo(Anuncios _equipo) {
//		return repositorioAnuncios.save(_equipo);
//	}
//	public void borrarEquipos (Integer _id) {
//		repositorioAnuncios.deleteById(_id);
//	}
}
