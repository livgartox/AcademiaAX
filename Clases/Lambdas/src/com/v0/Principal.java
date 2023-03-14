package com.v0;

import java.util.function.Predicate;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> pre01=s->s.contains("x");
		
		boolean res=pre01.test("Xochimilco");
		System.out.println(res);

	}

}
