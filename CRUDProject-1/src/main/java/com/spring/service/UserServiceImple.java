package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.DAO.IUserDao;
import com.spring.model.User;

@Service
public class UserServiceImple implements IUserService {
	
	//Inyección de dependencia, para traer todo el crud que nos da spring con el
	// CrudRepository.
	@Autowired
	private IUserDao userdao;

	@Override
	public User get(long id) {
		
		return userdao.findById(id).get();
	}

	@Override
	public List<User> getAll() {
		
		return (List<User>) userdao.findAll();
	}

	@Override
	public void post(User user) {
		
		userdao.save(user);
	}

	@Override
	public void put(User user, long id) {
		
		userdao.findById(id).ifPresent((x)->{
			user.setId(id);
			userdao.save(user);
		});
		
	}

	@Override
	public void delete(long id) {
		
		userdao.deleteById(id);
	}
	
	

}
