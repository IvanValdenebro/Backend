package com.example.ProyectoFinal.servicio.servicioImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Libro;
import com.example.ProyectoFinal.modelo.Prestamo;
import com.example.ProyectoFinal.modelo.Usuario;
import com.example.ProyectoFinal.repositorio.LibroRepository;
import com.example.ProyectoFinal.repositorio.PrestamoRepository;
import com.example.ProyectoFinal.servicio.PrestamoService;
@Service
public class PrestamoServiceImpl implements PrestamoService {
	
	@Autowired
	private PrestamoRepository repositorio;

	@Override
	public List<Prestamo> listar() {
		List<Prestamo> result = new ArrayList<>();
		repositorio.findAll().forEach(result::add);
		return result;
	}
	@Override
	public Prestamo add(Prestamo p) {
		return repositorio.save(p);
	}
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Prestamo> findById_Usuario(int idUsuario) {
		return repositorio.findByIdUsuario(idUsuario);
	}
	@Override
	public Prestamo findById(int id) {
		return repositorio.findById(id);
	}
	@Override
	public Prestamo edit(Prestamo p) {
		return repositorio.save(p);
	}

}
