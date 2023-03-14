package com.v0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Principal {
	private static Employee[] arrayOfEmps= {
			new Employee(0,"Patrobas",100.0),
			new Employee(1,"Tercio",200.0),
			new Employee(2,"Andronico",300.0),
			new Employee(3,"Epeneto",400.0),
			new Employee(4,"Filologo",500.0)
	};
	
	public static void main(String[] args) {
		List<Employee> listEmpleados=Arrays.asList(arrayOfEmps);
		
		List<Employee> empleadosSueldoMenos=new ArrayList<>();
		
		//Requerimientos: 

			//Filtrar los que ganan menos de 400

			//Incrementar sueldo en 200 a los que ganan menos de 400

			//Filtrar los que tengan una long>6 en su nombre

			//Ordenarlos por nombre

			//Obtener una lista de los nombres, nomás List<String> nombres
		
		for(Employee e:listEmpleados) {
			if(e.getSalary()<400) {
				System.out.println(e.toString());
				e.setSalary(e.getSalary()+200);
				empleadosSueldoMenos.add(e);
			}
		}
		
		System.out.println("Hola");
		empleadosSueldoMenos.toString();
		for(Employee e:empleadosSueldoMenos) {
			if(e.getNombre().length()>6) {
				System.out.println(e.toString());
			}
		}

		

	}



}
