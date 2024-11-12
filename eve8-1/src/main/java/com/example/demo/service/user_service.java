package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.user;
import com.example.demo.repository.user_repo;

@Service
public class user_service {

	@Autowired
	private user_repo repo;
	public List<user> usuarios(){
		return repo.findAll();
		
	}
public void borrar_usuarios(long id ) {
	repo.deleteById(id);
}
}
