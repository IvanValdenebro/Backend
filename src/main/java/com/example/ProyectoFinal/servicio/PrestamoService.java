package com.example.ProyectoFinal.servicio;

import java.util.List;


import com.example.ProyectoFinal.modelo.Libro;
import com.example.ProyectoFinal.modelo.Prestamo;


public interface PrestamoService {

	List<Prestamo> listar();

	Prestamo add(Prestamo p);

	void delete(int id);
	
	List<Prestamo> findById_Usuario(int idUsuario);
	
	Prestamo findById(int id);
	
	Prestamo edit(Prestamo p);
}
