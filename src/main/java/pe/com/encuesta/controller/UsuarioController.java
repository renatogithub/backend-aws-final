package pe.com.encuesta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.encuesta.model.Usuario;
import pe.com.encuesta.service.ISecurityService;

@RestController
@RequestMapping("/api/login")
public class UsuarioController {

	@Autowired
	private ISecurityService service;

	/*
	 * @GetMapping(value = "{user}/acceder/{pass}", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public ResponseEntity<Usuario>
	 * obtenerUsuario(@PathVariable("user") String usuario,
	 * 
	 * @PathVariable("pass") String password) { Usuario usuario1 = new Usuario();
	 * try { usuario1 = service.login(usuario, password); } catch (Exception e) {
	 * return new ResponseEntity<Usuario>(usuario1,
	 * HttpStatus.INTERNAL_SERVER_ERROR); }
	 * 
	 * return new ResponseEntity<Usuario>(usuario1, HttpStatus.OK); }
	 */
}
