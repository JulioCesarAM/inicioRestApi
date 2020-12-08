package com.example.demo.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Anuncios;
import com.example.demo.servicios.Anuncios_servicios;

@RestController
@RequestMapping(value ="/Anuncios", method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
public class equipoController {
	@Autowired
	Anuncios_servicios servicioAnuncios;
	
	@GetMapping("")
	public ResponseEntity<?> list(){
		List<Anuncios>listaEquipos=servicioAnuncios.mostrarEquipos();
		if (listaEquipos.isEmpty())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(listaEquipos);
		
	}
	@GetMapping("/{id}")
	public Anuncios get(@PathVariable Integer id){
		return servicioAnuncios.mostrarEquiposId(id);
//		
//		if (existe==null)
//			throw new ProductNotFoundException(id);
//		else
//			return servicioEquipos.mostrarEquiposId(id);
			
		
	}
//	@PostMapping("/")
//	public ResponseEntity<?> add(@RequestBody Anuncios equipo) {
//		Anuncios guardar=servicioAnuncios.guardarEquipo(equipo);
//		return ResponseEntity.status(HttpStatus.CREATED).body(guardar);
//	}
//	@PutMapping("/{id}")
//	public ResponseEntity<?>actualizar(@RequestBody Anuncios equipo, @PathVariable Integer id){
//		
//			Anuncios equipoExiste=servicioAnuncios.mostrarEquiposId(id);
//			if (equipoExiste!=null) {
//				equipoExiste.setNom_equipo(equipo.getNom_equipo());
//				return ResponseEntity.ok(servicioAnuncios.guardarEquipo(equipoExiste));
//			}
//			else
//				return ResponseEntity.notFound().build();
//	
//		
//	}
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Object> delete(@PathVariable Integer id) {
//		servicioAnuncios.borrarEquipos(id);
//		return ResponseEntity.noContent().build();
//	}
//	/**dto srping importante USAR
//	 * */
//	
//



}




