package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.PictureList;
import com.example.demo.servicios.PictureListService;

@RestController
@RequestMapping(value ="/picture",produces = MediaType.APPLICATION_JSON_VALUE)
public class PictureListController {
	@Autowired
	PictureListService pictureListService;
	
	@GetMapping("/all")
	public ResponseEntity<?> list(){
		List<PictureList>allPictures=pictureListService.getAllPictures();
		System.out.println(allPictures.toString());
		if (allPictures.isEmpty())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(allPictures);
		
		
		
	}
	@GetMapping("/by/{id}")
	public PictureList get(@PathVariable Integer id){
		return pictureListService.getPictureById(id);
//		
//		if (existe==null)
//			throw new ProductNotFoundException(id);
//		else
//			return servicioEquipos.mostrarEquiposId(id);
			
		
	}
	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody PictureList _picture) {
		PictureList guardar=pictureListService.savePicture(_picture);
		return ResponseEntity.status(HttpStatus.CREATED).body(guardar);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?>actualizar(@RequestBody PictureList _picture, @PathVariable Integer id){
		
		PictureList pictureExist=pictureListService.getPictureById(id);
			if (pictureExist!=null) {
				pictureExist.setPicture_path(_picture.getPicture_path());
				return ResponseEntity.ok(pictureListService.savePicture(pictureExist));
			}
			else
				return ResponseEntity.notFound().build();
	
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		pictureListService.delPicture(id);
		return ResponseEntity.noContent().build();
	}
	/**dto srping importante USAR
	 * */
}
