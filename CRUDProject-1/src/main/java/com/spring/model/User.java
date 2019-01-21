package com.spring.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("deprecation")
@Entity
@Table (name = "user")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	
	@NotEmpty
	@Length(min=5, max=24)
	private String name;
	
	@NotNull
    @Length(min=10, max=24)
	private String surname;
	
	@NotNull
    @Email
	private String email;
	
	public User() {
		
	}
	
	public User(@NotNull @Length(min = 5, max = 24) String name,
			@NotNull @Length(min = 10, max = 24) String surname, @NotNull @Email String email) {
		super();
		
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	public long getId() {
		return idUser;
	}

	public void setId(long id) {
		this.idUser = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	

}
