package com.spring.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.spring.model.User;
import com.spring.service.IUserService;

@RestController
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/Users")
	public List<User> getAllUser(){
		return userService.getAll();
	}
	
	@GetMapping("/User/{id}")
	public User getOne(@PathVariable(value = "id") long id){
		return userService.get(id);
	}
	
	//Agregar nuevo usuario.
	
	@PostMapping("/User")
	public void add(User user) {
		userService.post(user);
		
	}
	
	//Actualizar contacto
	
	@PutMapping("/UserUpdate")
	public void update(User user, long id) {
		userService.put(user, id);
	}

}
