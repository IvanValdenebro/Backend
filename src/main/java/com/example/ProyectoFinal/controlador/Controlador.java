package com.example.ProyectoFinal.controlador;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProyectoFinal.modelo.Libro;
import com.example.ProyectoFinal.modelo.Prestamo;
import com.example.ProyectoFinal.modelo.Usuario;
import com.example.ProyectoFinal.repositorio.LibroRepository;
import com.example.ProyectoFinal.repositorio.PrestamoRepository;
import com.example.ProyectoFinal.repositorio.UsuarioRepository;
import com.example.ProyectoFinal.servicio.LibroService;
import com.example.ProyectoFinal.servicio.PrestamoService;
import com.example.ProyectoFinal.servicio.UsuarioService;


@CrossOrigin(origins = "*" , maxAge = 3600)
@RestController
public class Controlador {

	 @Autowired
	 UsuarioService service;
	 @Autowired
	 LibroService libroService;
	 @Autowired
	 PrestamoService prestamoService;
	 @Autowired
	 UsuarioRepository usuarioRepository;
	 @Autowired
	 LibroRepository libroRepository;
	 @Autowired
	 PrestamoRepository prestamoRepository;
	 
	 @DeleteMapping("/libro/{id}")
	 public void delete(@PathVariable("id") int id) {
		 libroService.delete(id);
	 }
	 
	 @GetMapping("/prestamo/find/{idUsuario}")
	 public  List<Prestamo> listarById_Usuario(@PathVariable("idUsuario") int idUsuario) {
		 return prestamoService.findById_Usuario(idUsuario);
	 }
	 	 
	 @GetMapping("/libro/listar/{id}")
	 public Libro listarId(@PathVariable("id") int id) {
		 return libroService.findById(id);
	 }
	 @GetMapping("/prestamo/listar/{id}")
	 public Prestamo listarPrestamoId(@PathVariable("id") int id) {
		 return prestamoService.findById(id);
	 }
	 @PutMapping("libro/editar/{id}")
	 public Libro editar(@RequestBody Libro l, @PathVariable("id") int id){
		 l.setId(id);
		 return libroService.edit(l);
	 }
	 @PutMapping("prestamo/editar/{alquilado}")
	 public Prestamo editarPrestamo(@RequestBody Prestamo p, @PathVariable("alquilado") boolean alquilado){
		 p.setAlquilado(alquilado);
		 return prestamoService.edit(p);
	 }
	 @GetMapping({"/usuario"})
	 public List<Usuario>listar(){
		 return service.listar();
	 }
	 
	 
	 @GetMapping({"/prestamo"})
	 public List<Prestamo>listarPrestamo(){
		 return prestamoService.listar();
	 }
	 
	 @GetMapping({"/libro"}) 
	 public List<Libro>listarLibro(){
		 return libroService.listar();
	 }	 
	 @PostMapping("/libro")
	 public Libro agregar(@RequestBody Libro l) {
		 return libroService.add(l);
	 }
	 
	 @PostMapping("/usuario")
	 public Usuario agregar(@RequestBody Usuario u) {
		 return service.add(u);
	 }
	 
	 @PostMapping("/prestamo")
	 public Prestamo agregar(@RequestBody Prestamo p) {
		 return prestamoService.add(p);
	 }
	 @GetMapping("/libro/stock")
	 public List<Libro> findAllByStock() {
	    return libroRepository.findAllByStock();
	 }
	 @GetMapping("/prestamo/devolver/{id_usuario}")
	 public List<Prestamo> findAllByAlquilado(@PathVariable ("id_usuario") int id_usuario) {
	    return prestamoRepository.findAllByAlquiladoAndIdUsuario(id_usuario);
	 }
	 @GetMapping("/iniciarSesion/{nombre}/{contraseña}")
	 public Usuario findByNombreAndContraseña(@PathVariable ("nombre") String nombre, @PathVariable("contraseña") String contraseña) {
	    return usuarioRepository.findByNombreAndContraseña(nombre, contraseña);
	 }
	 
	
	 
	 
	 
}
