package com.example.ProyectoFinal.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Libro;


@Repository
public interface LibroRepository extends JpaRepository<Libro, Integer> {

	@Query(value = "SELECT * FROM libros WHERE stock = true", nativeQuery = true)
    List<Libro> findAllByStock();

	Libro findById(int id);
	
}
