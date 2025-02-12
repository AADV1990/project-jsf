/**
 * 
 */
package com.ad.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.ad.dto.UsuarioDTO;

/**
 * clase que se encarga de mantener la informacion del usuario que ingresa al aplicativo
 */

@ManagedBean
@SessionScoped
public class SessionController {

	private UsuarioDTO usuarioDTO;
	
	@PostConstruct
	public void init() {
		System.out.println("Cargando la informacion del usuario en la session...");
	}

	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
	

}
