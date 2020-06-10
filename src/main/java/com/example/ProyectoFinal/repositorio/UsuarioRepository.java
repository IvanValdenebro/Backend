package com.example.ProyectoFinal.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	public Usuario findByNombreAndContraseña(String nombre,String contraseña);
	
}
