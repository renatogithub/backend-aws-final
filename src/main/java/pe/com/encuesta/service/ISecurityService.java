package pe.com.encuesta.service;

import pe.com.encuesta.dto.RenewPasswordFirstDTO;
import pe.com.encuesta.dto.RespuestaApi;
import pe.com.encuesta.dto.UpdatePasswordDTO;

public interface ISecurityService {
	// Usuario login(String usuario, String password);
	public RespuestaApi getToken(String username, String password);

	public RespuestaApi resetNewPasswordFirst(RenewPasswordFirstDTO updatePassword);

	public RespuestaApi updatePassword(UpdatePasswordDTO updatePassword);

	public RespuestaApi signOut(String token);

	public RespuestaApi refreshToken(String token);
}
