package com.v0;

public class PredicadoRico implements PredicadoEmpleado{

	@Override
	public boolean probar(Empleado e) {
		// TODO Auto-generated method stub
		return e.getSueldo()>=500;
	}

}
