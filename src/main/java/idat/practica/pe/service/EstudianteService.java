package idat.practica.pe.service;

import java.util.List;

import idat.practica.pe.model.Estudiante;



public interface EstudianteService {

	void guardar(Estudiante estudiante);
	void actualizar(Estudiante estudiante);
	void eliminar(Integer id);
	List<Estudiante> listar();
	Estudiante obtener(Integer id);
}
