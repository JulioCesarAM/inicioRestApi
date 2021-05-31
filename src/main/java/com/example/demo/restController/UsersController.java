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

import com.example.demo.model.Users;
import com.example.demo.servicios.UsersService;

@RestController
@RequestMapping(value ="/user",produces = MediaType.APPLICATION_JSON_VALUE)
public class UsersController {

	@Autowired
	UsersService userService;
	
	@GetMapping("/all")
	public ResponseEntity<?> list(){
		List<Users>allUsers=userService.getAllUsers();
		System.out.println(allUsers.toString());
		if (allUsers.isEmpty())
			return ResponseEntity.notFound().build();
		else
			return ResponseEntity.ok(allUsers);
		
		
		
	}
	@GetMapping("/by/{id}")
	public Users get(@PathVariable Integer id){
		return userService.getUsersById(id);
//		
//		if (existe==null)
//			throw new ProductNotFoundException(id);
//		else
//			return servicioEquipos.mostrarEquiposId(id);
			
		
	}
	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody Users _users) {
		Users guardar=userService.saveUser(_users);
		return ResponseEntity.status(HttpStatus.CREATED).body(guardar);
	}
	@PutMapping("/{id}")
	public ResponseEntity<?>actualizar(@RequestBody Users _user, @PathVariable Integer id){
		
		Users userExist=userService.getUsersById(id);
			if (userExist!=null) {
				userExist.setEmail(_user.getEmail());
				return ResponseEntity.ok(userService.saveUser(userExist));
			}
			else
				return ResponseEntity.notFound().build();
	
		
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		userService.delUser(id);
		return ResponseEntity.noContent().build();
	}
	/**dto srping importante USAR
	 * */
}
