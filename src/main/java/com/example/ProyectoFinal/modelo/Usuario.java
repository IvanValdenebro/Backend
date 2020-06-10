package com.example.ProyectoFinal.modelo;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre;
	@Column
	private String contraseña;
	@Column
	private Boolean role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return nombre;
	}

	public Boolean getRole() {
		return role;
	}

	public void setRole(Boolean role) {
		this.role = role;
	}

	public void setName(String name) {
		this.nombre = name;
	}

	public String getPassword() {
		return contraseña;
	}

	public void setPassword(String password) {
		this.contraseña = password;
	}
}
