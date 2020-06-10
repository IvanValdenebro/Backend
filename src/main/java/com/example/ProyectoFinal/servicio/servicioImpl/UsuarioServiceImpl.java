package com.example.ProyectoFinal.servicio.servicioImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Usuario;
import com.example.ProyectoFinal.repositorio.UsuarioRepository;
import com.example.ProyectoFinal.servicio.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repositorio;
	
	@Override
	public List<Usuario> listar() {
		List<Usuario> result = new ArrayList<>();
		repositorio.findAll().forEach(result::add);
		return result;
	}
	@Override
	public Usuario delete() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Usuario add(Usuario u) {
		return repositorio.save(u);
	}
	
	

}
