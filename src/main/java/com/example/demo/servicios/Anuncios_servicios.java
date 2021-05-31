package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.error.ProductNotFoundException;
import com.example.demo.model.Announcement;
import com.example.demo.repositorios.Announcement_repository;
@Service
public class Anuncios_servicios {
	@Autowired
	private Announcement_repository repositorioAnuncios;
	public List<Announcement> getAllAnnouncement(){
		return repositorioAnuncios.findAll();
	}
	public Announcement getAnnouncementById(Integer _id) {
		return repositorioAnuncios.findById(_id).orElseThrow(()->new ProductNotFoundException(_id));
	}
	public Announcement saveAnnouncement(Announcement __announcement) {
		return repositorioAnuncios.save(__announcement);
	}
	public void delAnnouncement (Integer _id) {
		repositorioAnuncios.deleteById(_id);
	}

	}
