package com.spring.DAO;

import org.springframework.data.repository.CrudRepository;

import com.spring.model.User;

public interface IUserDao extends CrudRepository<User, Long> {
	

}
