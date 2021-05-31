package com.example.demo.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Announcement;


public interface Announcement_repository extends JpaRepository<Announcement,Integer> {

}

// ya tiene metodos creados para las consultas sooo no tenemos que hacer nada ??