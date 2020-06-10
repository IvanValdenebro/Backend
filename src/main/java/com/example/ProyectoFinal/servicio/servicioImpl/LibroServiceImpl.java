package com.example.ProyectoFinal.servicio.servicioImpl;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Libro;
import com.example.ProyectoFinal.repositorio.LibroRepository;
import com.example.ProyectoFinal.servicio.LibroService;
@Service
public class LibroServiceImpl implements LibroService{
	
	@Autowired
	private LibroRepository repositorio;

	@Override
	public List<Libro> listar() {
		List<Libro> result = new ArrayList<>();
		repositorio.findAll().forEach(result::add);
		return result;
	}

	@Override
	public Libro add(Libro l) {
		return repositorio.save(l);
	}

	@Override
	public void delete(int id) {	
			repositorio.deleteById(id);		
	}

	@Override
	public Libro edit(Libro l) {
		return repositorio.save(l);
	}

	@Override
	public Libro findById(int id) {
		return repositorio.findById(id);
	}


	
}
