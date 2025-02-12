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
			Empleado empleadoHP =  new Empleado();
			Empleado empleadoORACLE =  new Empleado();
			Empleado empleadoSONY =  new Empleado();
			Empleado empleadoDISNEY =  new Empleado();
			Empleado empleadoAAA =  new Empleado();
			Empleado empleadoA =  new Empleado();
			
			
			
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
			
			empleadoHP.setNombre("av");
			empleadoHP.setPrimerApellido("dura");
			empleadoHP.setSegundoApellido("Ver");
			empleadoHP.setPuesto("jsf");
			empleadoHP.setEstatus(false);
			
			empleadoORACLE.setNombre("av");
			empleadoORACLE.setPrimerApellido("dura");
			empleadoORACLE.setSegundoApellido("Ver");
			empleadoORACLE.setPuesto("jsf");
			empleadoORACLE.setEstatus(false);
			
			empleadoSONY.setNombre("av");
			empleadoSONY.setPrimerApellido("dura");
			empleadoSONY.setSegundoApellido("Ver");
			empleadoSONY.setPuesto("jsf");
			empleadoSONY.setEstatus(false);
			
			empleadoDISNEY.setNombre("av");
			empleadoDISNEY.setPrimerApellido("dura");
			empleadoDISNEY.setSegundoApellido("Ver");
			empleadoDISNEY.setPuesto("jsf");
			empleadoDISNEY.setEstatus(false);
			
			empleadoAAA.setNombre("av");
			empleadoAAA.setPrimerApellido("dura");
			empleadoAAA.setSegundoApellido("Ver");
			empleadoAAA.setPuesto("jsf");
			empleadoAAA.setEstatus(false);
			
			empleadoA.setNombre("av");
			empleadoA.setPrimerApellido("dura");
			empleadoA.setSegundoApellido("Ver");
			empleadoA.setPuesto("jsf");
			empleadoA.setEstatus(false);
			
			empleados.add(empleadoIBM);
			empleados.add(empleadoMICROSOFT);
			empleados.add(empleadoAPPLE);
			empleados.add(empleadoHP);
			empleados.add(empleadoORACLE);
			empleados.add(empleadoSONY);
			empleados.add(empleadoDISNEY);
			empleados.add(empleadoAAA);
			empleados.add(empleadoA);
			
			return empleados;
			
		}

}
