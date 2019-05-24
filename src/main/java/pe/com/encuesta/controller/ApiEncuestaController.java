package pe.com.encuesta.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.encuesta.exception.ModeloNotFoundException;
import pe.com.encuesta.model.Encuesta;
import pe.com.encuesta.model.RespuestaApi;
import pe.com.encuesta.service.IEncuestaService;

@RestController
@RequestMapping("/api/encuesta")
public class ApiEncuestaController {

	@Autowired
	private IEncuestaService service;

	@GetMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Encuesta>> listar() {
		List<Encuesta> encuestas = new ArrayList<>();
		try {
			encuestas = service.listar();
			return new ResponseEntity<List<Encuesta>>(encuestas, HttpStatus.OK);			
		} catch (Exception e) {
			return new ResponseEntity<List<Encuesta>>(encuestas, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping(value = "/listar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Encuesta> listarId(@PathVariable("id") Integer id) {
		Encuesta encuesta = new Encuesta();
		
		encuesta = service.listarId(id);
		if (encuesta == null) {
			throw new ModeloNotFoundException("ID: " + id);
		}

		return new ResponseEntity<Encuesta>(encuesta, HttpStatus.OK);
	}

	@PostMapping(value = "registrar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<RespuestaApi> registrar(@Valid @RequestBody Encuesta encuesta) {
		try {
			service.registrar(encuesta);
			return new ResponseEntity<RespuestaApi>(new RespuestaApi("OK",""), HttpStatus.OK);					
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	

	@PutMapping(value = "/actualizar", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> actualizar(@RequestBody Encuesta encuesta) {
		int resultado = 0;

		try {
			service.modificar(encuesta);
			resultado = 0;
			return new ResponseEntity<Integer>(resultado, HttpStatus.OK);			
		} catch (Exception e) {
			resultado = 1;
			return new ResponseEntity<>(resultado, HttpStatus.INTERNAL_SERVER_ERROR);			
		}

	}

}
