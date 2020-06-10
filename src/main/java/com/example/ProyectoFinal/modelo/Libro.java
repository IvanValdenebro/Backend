package com.example.ProyectoFinal.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "libros")
public class Libro {

	@Id
	@Column
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getSubgenero() {
		return subgenero;
	}
	public void setSubgenero(String subgenero) {
		this.subgenero = subgenero;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public Boolean getStock() {
		return stock;
	}
	public void setStock(Boolean stock) {
		this.stock = stock;
	}
	@Column
	private String nombre;
	@Column
	private String autor;
	@Column
	private String genero;
	@Column
	private String subgenero;
	@Column
	private String fecha;
	@Column
	private Boolean stock;
}
