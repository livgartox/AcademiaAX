package com.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PrincipalSupplier {
	public static void main(String[] args) {
		//DEF LAMBDA
		Supplier<StringBuilder> supp=()->new StringBuilder("Hola");
		
		//Ejecución de la lambda
		StringBuilder sbRes=supp.get();
		
		System.out.println(sbRes);
		
		Supplier <Integer> sup2=() -> Integer.valueOf(9);
		
		Integer integer=sup2.get();
		System.out.println(integer);
		
		Supplier<Integer> sup3=() -> 8;
		int i=sup3.get();
		System.out.println(i);
		
		Supplier<Employee> sup4=() -> new Employee(4, "Filologo", 500.0);
		System.out.println(sup4.get());
		
		Supplier<List<String>> sup5=()->new ArrayList<String>();
		System.out.println(sup5.get());
		
		
	}
}
