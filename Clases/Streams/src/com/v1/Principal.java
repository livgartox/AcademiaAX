package com.v1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {
	private static Employee[] arrayOfEmps= {
			new Employee(0,"Patrobas",100.0),
			new Employee(1,"Tercio",200.0),
			new Employee(2,"Andronico",300.0),
			new Employee(3,"Epeneto",400.0),
			new Employee(4,"Filologo",500.0)
	};
	
	public static void main(String[] args) {
		
		//Requerimientos: 

			//Filtrar los que ganan menos de 400

			//Incrementar sueldo en 200 a los que ganan menos de 400

			//Filtrar los que tengan una long>6 en su nombre

			//Ordenarlos por nombre

			//Obtener una lista de los nombres, nomás List<String> nombres
		
		List<Employee> listEmpleados=Arrays.asList(arrayOfEmps);
		
		List<String> nombres=listEmpleados.stream()
				.filter(x->x.getSalary()<400)
				//.peek(System.out::println) //Imprimir los pasos
				.peek(emp->emp.incrementarSalario(200))
				//.peek(System.out::println)
				.filter(z->z.getNombre().length()>6)
				.peek(System.out::println)
				.sorted(Comparator.comparing(Employee::getNombre))
				.map(y->y.getNombre())
				.collect(Collectors.toList());
		
		System.out.println(nombres);

	}



}
