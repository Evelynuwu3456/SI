package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.service.user_service;

@Controller
public class user_controller {
	
	@Autowired
	private user_service service;
	@GetMapping("/users")
	public String tabla_usuarios(Model m ) {
		m.addAttribute("users", service.usuarios());
		return "usuarios";
	}
	
	@GetMapping("/users/delete/{id}")
	public String borrar_usuarios(@PathVariable("id")long id) {
		service.borrar_usuarios(id);
		return "redirect:/users";
		
		
	}
}
