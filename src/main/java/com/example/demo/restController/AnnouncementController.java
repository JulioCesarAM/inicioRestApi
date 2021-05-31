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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Announcement;
import com.example.demo.servicios.Anuncios_servicios;

@RestController
@RequestMapping(value ="/Announcement",produces = MediaType.APPLICATION_JSON_VALUE)
public class AnnouncementController {
	@Autowired
	Anuncios_servicios servicioAnuncios;
	
	@GetMapping("/all")
	public ResponseEntity<?> list(){
		List<Announcement>allAnnouncement=servicioAnuncios.getAllAnnouncement();
		System.out.println(allAnnouncement.toString());
		if (allAnnouncement.isEmpty())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(allAnnouncement);
		
		
		
	}
	@GetMapping("/by/{id}")
	public Announcement get(@PathVariable Integer id){
		return servicioAnuncios.getAnnouncementById(id);
//		
//		if (existe==null)
//			throw new ProductNotFoundException(id);
//		else
//			return servicioEquipos.mostrarEquiposId(id);
			
		
	}
	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody Announcement _announcement) {
		Announcement guardar=servicioAnuncios.saveAnnouncement(_announcement);
		return ResponseEntity.status(HttpStatus.CREATED).body(guardar);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?>actualizar(@RequestBody Announcement _announcement, @PathVariable Integer id){
		
		Announcement announcementExist=servicioAnuncios.getAnnouncementById(id);
			if (announcementExist!=null) {
				announcementExist.setTitle(_announcement.getTitle());
				return ResponseEntity.ok(servicioAnuncios.saveAnnouncement(announcementExist));
			}
			else
				return ResponseEntity.notFound().build();
	
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		servicioAnuncios.delAnnouncement(id);
		return ResponseEntity.noContent().build();
	}
	/**dto srping importante USAR
	 * */
	




}




