package com.example.demo.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.error.ProductNotFoundException;
import com.example.demo.model.Users;
import com.example.demo.repositorios.UsersRepository;

@Service
public class UsersService {

	@Autowired
	private UsersRepository userRepository;
	
	public List<Users> getAllUsers(){
		return userRepository.findAll();
	}
	public Users getUsersById(Integer _id) {
		return userRepository.findById(_id).orElseThrow(()->new ProductNotFoundException(_id));
	}
	public Users saveUser(Users __user) {
		return userRepository.save(__user);
	}
	public void delUser(Integer _id) {
		userRepository.deleteById(_id);
	}

}
