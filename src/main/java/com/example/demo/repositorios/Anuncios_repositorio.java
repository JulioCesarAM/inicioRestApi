package com.example.demo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Anuncios;


public interface Anuncios_repositorio extends JpaRepository<Anuncios,Integer> {

}

// ya tiene metodos creados para las consultas sooo no tenemos que hacer nada ??