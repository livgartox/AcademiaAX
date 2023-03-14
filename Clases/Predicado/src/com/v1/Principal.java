package com.v1;

public class Principal {
	public static void main(String[] args) {
		
		Empleado e1=new Empleado("Patrobas", 30, 567.89);
		Empleado e2=new Empleado("Tercio",24 , 1500);
		Empleado e3=new Empleado("Andronico",33 , 400);
		Empleado e4=new Empleado("Epeneto",25, 1400);
		Empleado[] arrayEmpleados= {e1,e2,e3,e4};
		boolean res;
		boolean res2;
		
		PredicadoEmpleado pe=new PredicadoEmpleado() {
			
			@Override
			public boolean probar(Empleado e) {
				// TODO Auto-generated method stub
				return e.getEdad()>=18;
			}
		};
		
		res=pe.probar(e1);
		System.out.println(res);
		
		PredicadoEmpleado pe2=new PredicadoEmpleado() {
				
				@Override
				public boolean probar(Empleado e) {
					// TODO Auto-generated method stub
					return e.getSueldo()>=500;
				}
			};
			
			
			res2=pe2.probar(e2);
			System.out.println(res2);
		
	}
	
	

}
