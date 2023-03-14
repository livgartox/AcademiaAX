package com.v0;

public class PredicadoMayorDeEdad implements PredicadoEmpleado{

	@Override
	public boolean probar(Empleado e) {
		// TODO Auto-generated method stub
		return e.getEdad()>=18;
	}

}
