package pe.com.encuesta.model;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Información de la encuesta")
@Entity
@Table(name = "tab_encuesta")
@Cacheable(true)
public class Encuesta implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ApiModelProperty(notes = "Nombres debe tener minimo 3 caracteres")
	@Size(min = 3, message = "Nombres debe tener minimo 3 caracteres")
	@Column(name = "nombres", nullable = false, length = 200)
	private String nombres;
	@ApiModelProperty(notes = "Apellidos debe tener minimo 3 caracteres")
	@Size(min = 3, message = "Apellidos debe tener minimo 3 caracteres")
	@Column(name = "apellidos", nullable = false, length = 200)
	private String apellidos;
	@ApiModelProperty(notes = "Edad debe tener minimo 2 digitos")
	@Column(name = "edad", nullable = false, length = 3)
	private int edad;
	@ApiModelProperty(notes = "Profesion debe tener minimo 3 caracteres")
	@Size(min = 3, message = "Profesion debe tener minimo 3 caracteres")
	@Column(name = "profesion", nullable = false, length = 200)
	private String profesion;
	@ApiModelProperty(notes = "Lugar de Trabajo debe tener minimo 3 caracteres")
	@Size(min = 3, message = "Lugar de Trabajo  debe tener minimo 3 caracteres")
	@Column(name = "lugartrabajo", nullable = false, length = 200)
	private String lugartrabajo;
	@ApiModelProperty(notes = "Elección debe tener minimo 2 caracteres")
	@Size(min = 2, message = "Elección  debe tener minimo 2 caracteres")
	@Column(name = "eleccion", nullable = false, length = 200)
	private String eleccion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getProfesion() {
		return profesion;
	}

	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}

	public String getLugartrabajo() {
		return lugartrabajo;
	}

	public void setLugartrabajo(String lugartrabajo) {
		this.lugartrabajo = lugartrabajo;
	}

	public String getEleccion() {
		return eleccion;
	}

	public void setEleccion(String eleccion) {
		this.eleccion = eleccion;
	}

}
