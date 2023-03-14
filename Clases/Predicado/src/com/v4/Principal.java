package com.v4;

public class Principal {
	public static void main(String[] args) {
		
		Empleado e1=new Empleado("Patrobas", 30, 267.89);
		Empleado e2=new Empleado("Tercio",24 , 1500);
		Empleado e3=new Empleado("Andronico",33 , 100);
		Empleado e4=new Empleado("Epeneto",25, 1400);
		Empleado[] arrayEmpleados= {e1,e2,e3,e4};
		
		System.out.println("Es mayor de edad");
		showEmpleados(arrayEmpleados, e->e.getEdad()>=18);
		
		System.out.println("Es rico");
		showEmpleados(arrayEmpleados, e->e.getSueldo()>=500);
		
		System.out.println("************");
		String cadena="Andrónico";
		Predicado<String> p=c->c.length()>8;
		System.out.println(p.probar(cadena));
		
		
	}
	static void showEmpleados(Empleado[] arrayEmpleados,Predicado<Empleado> pe) {
		for(Empleado e:arrayEmpleados) {
			System.out.println(e);
			System.out.println(pe.probar(e));
		}
	}
	

}
