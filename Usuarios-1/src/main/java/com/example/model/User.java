package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
			public long id;
			public String nombre;
			public String dni;
			public long getId(){
			return id;
			}
			
			public void setId(long id) {
				this.id = id;
			}
			
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			public String getNombre() {
				return nombre;
			}
			
			public void setDni(String dni) {
				this.dni = dni;
			}
			public String getDni() {
				return dni;
			}
			
			
		}

