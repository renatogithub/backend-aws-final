package pe.com.encuesta.service;

import pe.com.encuesta.model.Usuario;

public interface IUsuarioService {
	Usuario login(String usuario, String password);
}
