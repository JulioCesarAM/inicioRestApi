package com.example.demo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PictureList;

public interface PictureListRepository extends JpaRepository<PictureList,Integer> {

}
