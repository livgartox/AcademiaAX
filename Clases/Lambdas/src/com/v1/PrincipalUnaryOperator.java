package com.v1;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class PrincipalUnaryOperator {
	public static void main(String[] args) {
		//DEFINICIÓN DE LAMBDA
		Function<String,String> fun=s->s.concat(" World");
		System.out.println(fun.apply("Hello"));
		
		UnaryOperator<String> uo=s->s.concat("World");
		System.out.println(uo.apply("Hello "));
		
		UnaryOperator<Employee> uoEmp=e->{e.setSalary(10);
											return e;
		};
		
		Employee e=new Employee(4,"Filologo",500.00);
		Employee newEmp=uoEmp.apply(e);
		System.out.println(newEmp);
		}
	}
