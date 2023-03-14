package com.v2;

public class Principal {
	public static void main(String[] args) {
		
		Empleado e1=new Empleado("Patrobas", 30, 267.89);
		Empleado e2=new Empleado("Tercio",24 , 1500);
		Empleado e3=new Empleado("Andronico",33 , 100);
		Empleado e4=new Empleado("Epeneto",25, 1400);
		Empleado[] arrayEmpleados= {e1,e2,e3,e4};
		boolean res;
		boolean res2;
		
		PredicadoEmpleado pe=e->e.getEdad()>=18;
		
		res=pe.probar(e1);
		System.out.println(res);
		
		PredicadoEmpleado pe2=e->e.getSueldo()>=500;
			
			
			res2=pe2.probar(e3);
			System.out.println(res2);
		
	}
	
	

}
