package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.service.User_service;

@Controller
public class User_controller {
	//Para el listado, enrealidad para subir y crear la tabla de usuarios
	//@Autowired
//	private User_service service;
	@GetMapping("/person")
	public String tabla_usuarios(Model m ) {
		//m.addAttribute("person", service.usuarios());
		return "person";
	}
	
//eliminar usuario
	@GetMapping("/person/delete/{id}")
	public String borrar_usuarios(@PathVariable("id")long id) {
	//service.borrar_usuarios(id);
		return "redirect:/person";
		
		
	}
}
