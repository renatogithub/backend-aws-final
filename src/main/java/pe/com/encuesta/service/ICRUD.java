package pe.com.encuesta.service;

import java.util.List;

public interface ICRUD<T> {

	void registrar(T t);

	T modificar(T t);

//	void eliminar(int id);

	T listarId(int id);

	List<T> listar();
}
