package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.example.model.User;
import com.example.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository userRepository;
	private User user;
	
	@GetMapping("/person1")
	 public String listarPersonas(Model model) {
		  model.addAttribute("person", userRepository.findAll());
		  return "person";//verificar el index sigo en duda
		 }
//eliminar usuario
	@GetMapping("/person/delete/{id}")
	public String delete(Model model, @PathVariable("id")long id) {
	userRepository.deleteById(id);
		return "redirect:/person1";
		
		
	}
}