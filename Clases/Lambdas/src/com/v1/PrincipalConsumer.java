package com.v1;
import java.util.function.*;

public class PrincipalConsumer {
	public static void main(String[] args) {
		//DEFINICIÓN DE LAMBDA
		Consumer<String> con1= s -> System.out.println(s+" World");
		
		//EJECUTAR LA LAMBDA
		con1.accept("Hello");
	}

}
