package idat.practica.pe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.practica.pe.model.Estudiante;
@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{

}
