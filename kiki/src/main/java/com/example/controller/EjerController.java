package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Random;


@RestController
@RequestMapping("/")
public class EjerController {

	
	//Crear un proyecto de tipo spring boot o web dynamic, todos los request se hacer po GET
	//Crear un método llamado "generador()" que no reciba parámetros y que devuelva un ArrayList de 5 elementos enteros random
	//Crear un metodo llamado promedio() que si la ruta es /promedio devuelva el promedio de estos 5 numeros
	//Crear un metodo llamado teorico() que se invoca con la ruta /teorico y devuelve un string explicando que es la sobreescritura y que es la sobrecarga de metodos
	
	private ArrayList<Integer> generador(){//CREO EL METODO GENERADOR
		ArrayList<Integer> numeros = new ArrayList<>(); //CREO EL Array list para la lista de numeros
		Random random = new Random();//creo el metodo random  que me va a traer numeros variados osea al azar
		for(int i=0;i<5;i++) {
			numeros.add(random.nextInt(100));//numeros entre 0 y 99
		}
		return numeros;
	}
	
	@GetMapping("/promedio")
	public double promedio() {
		ArrayList<Integer> numeros = generador();
		double suma = 0;
		
		for (int num : numeros) {
			suma += num;
		}
		return suma / numeros.size();
		}
	@GetMapping("/teorico")
	public String Teorico () {
		return "lo que vallllaaaaaaaaaaaa" + "lo otrooooooooooooooo";
	}
}
