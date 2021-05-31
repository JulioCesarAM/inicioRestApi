package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.error.ProductNotFoundException;
import com.example.demo.model.PictureList;
import com.example.demo.repositorios.PictureListRepository;

@Service
public class PictureListService {
	@Autowired
	private PictureListRepository pictureListRepository;
	
	public List<PictureList> getAllPictures(){
		return pictureListRepository.findAll();
	}
	public PictureList getPictureById(Integer _id) {
		return pictureListRepository.findById(_id).orElseThrow(()->new ProductNotFoundException(_id));
	}
	public PictureList savePicture(PictureList __picture) {
		return pictureListRepository.save(__picture);
	}
	public void delPicture(Integer _id) {
		pictureListRepository.deleteById(_id);
	}

}
