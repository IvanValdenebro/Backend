package com.example.ProyectoFinal.servicio;

import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Usuario;
public interface UsuarioService {
	List<Usuario> listar();

	Usuario delete();

	Usuario add(Usuario u);
	
}
