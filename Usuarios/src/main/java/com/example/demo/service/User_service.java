package com.example.demo.service;
	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.example.demo.repository.*;
	import com.example.demo.model.*;

	@Service
public class User_service {

		@Autowired
		private User_repository repo;
		public List<person> usuarios(){
			return repo.findAll();
			
		}
	public void borrar_usuarios(long id ) {
		repo.deleteById(id);
	}
	}


