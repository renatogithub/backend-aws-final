package pe.com.encuesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pe.com.encuesta.model.Usuario;

public interface IUsuarioDao extends JpaRepository<Usuario, Integer> {
	@Query("select u from Usuario u where u.usuario=?1 and u.password=?2")
	Usuario findOneByUsernamePassword(String username, String password);
}
