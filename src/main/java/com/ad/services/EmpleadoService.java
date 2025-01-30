/**
 * 
 */
package com.ad.services;

import java.util.ArrayList;
import java.util.List;

import com.ad.entity.Empleado;

/**
 * Clase que permite realizar la logica del negocio para empleados
 */
public class EmpleadoService {
	
	
	
	
		public List<Empleado> consultarEmpleados() {
			
			List<Empleado> empleados =  new ArrayList<Empleado>();
			Empleado empleadoIBM =  new Empleado();
			Empleado empleadoMICROSOFT =  new Empleado();
			Empleado empleadoAPPLE =  new Empleado();
			
			empleadoIBM.setNombre("Ad");
			empleadoIBM.setPrimerApellido("D");
			empleadoIBM.setSegundoApellido("V");
			empleadoIBM.setPuesto("java");
			empleadoIBM.setEstatus(true);
			
			empleadoMICROSOFT.setNombre("ar");
			empleadoMICROSOFT.setPrimerApellido("Du");
			empleadoMICROSOFT.setSegundoApellido("Ve");
			empleadoMICROSOFT.setPuesto("javaee");
			empleadoMICROSOFT.setEstatus(true);
			
			empleadoAPPLE.setNombre("av");
			empleadoAPPLE.setPrimerApellido("dura");
			empleadoAPPLE.setSegundoApellido("Ver");
			empleadoAPPLE.setPuesto("jsf");
			empleadoAPPLE.setEstatus(false);
			
			empleados.add(empleadoIBM);
			empleados.add(empleadoMICROSOFT);
			empleados.add(empleadoAPPLE);
			
			return empleados;
			
		}

}
