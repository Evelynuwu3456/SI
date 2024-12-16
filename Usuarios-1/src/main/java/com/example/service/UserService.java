package com.example.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.model.User;
import com.example.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository user;
	public List<User> user(){
		return user.findAll();
		
	}
public void delete(long id ) {
	user.deleteById(id);
}
}


