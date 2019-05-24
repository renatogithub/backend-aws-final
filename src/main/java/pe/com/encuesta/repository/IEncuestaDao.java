package pe.com.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.com.encuesta.model.Encuesta;

public interface IEncuestaDao extends JpaRepository<Encuesta, Integer> {

}
