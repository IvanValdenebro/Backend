package com.example.ProyectoFinal.modelo;

import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "Prestamo")
public class Prestamo {

	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int idUsuario;
	@Column
	private int idLibro;
	@Column
	private String usuario;
	
	@Column
	private String titulo;
	
	@Column
	private String fechaRecogida;
	@Column
	private String fechaDevolucion;
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	@Column
	private Boolean alquilado;
	
	public Boolean getAlquilado() {
		return alquilado;
	}
	public void setAlquilado(Boolean alquilado) {
		this.alquilado = alquilado;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	public String getFechaRecogida() {
		return fechaRecogida;
	}
	public void setFechaRecogida(String fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
