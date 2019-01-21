package com.spring.service;

import java.util.List;

import com.spring.model.User;

public interface IUserService {
	
	//Devuelve un usuario, según su id.
	
	public User get(long id);
	
	//Devuelve todos los usuarios.
	
	public List<User> getAll();
	
	//Agregar nuevo usuario.
	
	public void post(User user);
	
	//Modificar usuario.
	
	public void put(User user, long id);
	
	//Borra un usuario. Según su id.
	
	public void delete(long id);
	
	

}
