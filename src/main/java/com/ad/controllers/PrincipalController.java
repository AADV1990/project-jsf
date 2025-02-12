/**
 * 
 */
package com.ad.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.ad.entity.Empleado;
import com.ad.services.EmpleadoService;

/**
 * Clase controller que se encarga de procesar informacion para pantalla principal
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	
	private List<Empleado> empleados;

	private List<Empleado> empleadosFiltrados;
	
	private EmpleadoService empleadoService = new EmpleadoService();
	
	public void consultarEmpleados() {
		
	this.empleados	= this.empleadoService.consultarEmpleados();
	}
    /**
	*metodo que se encarga de incializar la informacion de la pantalla principal
	*/
	@PostConstruct
	public void init() {
		this.consultarEmpleados();
	}
	
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	
	

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}
	
	
	

}
