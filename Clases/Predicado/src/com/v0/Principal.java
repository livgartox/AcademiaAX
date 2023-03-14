package com.v0;

public class Principal {
	public static void main(String[] args) {
		
		Empleado e1=new Empleado("Patrobas", 30, 567.89);
		Empleado e2=new Empleado("Tercio",24 , 1500);
		Empleado e3=new Empleado("Andronico",33 , 400);
		Empleado e4=new Empleado("Epeneto",25, 1400);
		Empleado[] arrayEmpleados= {e1,e2,e3,e4};
		boolean res;
		boolean res2;
		
		PredicadoEmpleado pe=new PredicadoMayorDeEdad();
		
		res=pe.probar(e1);
		System.out.println(res);
		
		PredicadoEmpleado pe2=new PredicadoRico();
		
		res2=pe2.probar(e4);
		System.out.println("IsRich "+res);
	}
	
	

}
