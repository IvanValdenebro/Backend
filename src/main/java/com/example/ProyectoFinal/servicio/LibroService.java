package com.example.ProyectoFinal.servicio;

import java.util.*;


import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Libro;
@Service
public interface LibroService {
	List<Libro> listar();

	Libro add(Libro l);

	void delete(int id);
	
	Libro edit(Libro l);

	Libro findById(int id);
	
	
}
