package com.example.ProyectoFinal.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ProyectoFinal.modelo.Libro;
import com.example.ProyectoFinal.modelo.Prestamo;

@Repository
public interface PrestamoRepository extends CrudRepository<Prestamo, Integer> {

	/*@Query(value = "SELECT * FROM prestamos WHERE id_usuario = :id_usuario", nativeQuery = true)
    List<Prestamo> findAllByIdUsuario();*/
	
	@Query(value = "SELECT * FROM prestamo WHERE alquilado = true and id_usuario = :id_usuario", nativeQuery = true)
	List<Prestamo> findAllByAlquiladoAndIdUsuario(int id_usuario);
	
	List<Prestamo> findByIdUsuario(int idUsuario);
	
	Prestamo findById(int id);
}
