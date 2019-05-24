package pe.com.encuesta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.encuesta.model.Usuario;
import pe.com.encuesta.repository.IUsuarioDao;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao dao;

	@Override
	public Usuario login(String usuario, String password) {
		return dao.findOneByUsernamePassword(usuario, password);
	}

}
