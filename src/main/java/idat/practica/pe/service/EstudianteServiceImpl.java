package idat.practica.pe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.practica.pe.model.Estudiante;
import idat.practica.pe.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {
	
	@Autowired
	private EstudianteRepository repositorio;

	@Override
	public void guardar(Estudiante estudiante) {
		repositorio.save(estudiante);

	}

	@Override
	public void actualizar(Estudiante estudiante) {
		repositorio.saveAndFlush(estudiante);

	}

	@Override
	public void eliminar(Integer id) {
		repositorio.deleteById(id);

	}

	@Override
	public List<Estudiante> listar() {
		return repositorio.findAll();
	}

	@Override
	public Estudiante obtener(Integer id) {
		return repositorio.findById(id).orElse(null);
	}

}
