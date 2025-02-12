package com.ad.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.ad.dto.UsuarioDTO;


/**
 * @author alcides Clase que permite controlar el funcionamiento con la pantalla
 *         login.xtml
 */

@ManagedBean
public class loginController {

	private String usuario;
	private String password;
	@ManagedProperty("#{sessionController}")
	private SessionController sessionController;
	public void ingresar() {
		System.out.println("Usuario: " + usuario);

		if (usuario.equals("ad") && password.equals("ad")) {
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				
				
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (Exception e) {
				FacesContext.getCurrentInstance().addMessage("formlogin:usuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}

		} else {
			FacesContext.getCurrentInstance().addMessage("formlogin:usuario",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y contraeña incorrecto", ""));

		}
	}

	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SessionController getSessionController() {
		return sessionController;
	}

	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}
	
	

}
