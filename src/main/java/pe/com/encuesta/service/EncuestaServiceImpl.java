package pe.com.encuesta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.encuesta.model.Encuesta;
import pe.com.encuesta.repository.IEncuestaDao;

@Service
public class EncuestaServiceImpl implements IEncuestaService {

	@Autowired
	private IEncuestaDao dao;

	@Override
	public void registrar(Encuesta encuesta) {
		this.dao.save(encuesta);
	}

	@Override
	public Encuesta modificar(Encuesta encuesta) {
		return dao.save(encuesta);
	}


	@Override
	public Encuesta listarId(int idEncuesta) {
		return dao.findOne(idEncuesta);
	}
	
	@Override
	public List<Encuesta> listar() {
		return dao.findAll();
	}


}
