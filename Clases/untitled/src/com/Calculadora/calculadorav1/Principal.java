package com.Calculadora.calculadorav1;

public class Principal {
    public static void main(String[] args) {
        Operacion sum1=new Suma(4,5);
        System.out.println(sum1.ejecuta());

        Operacion res1=new Resta(5,9);
        System.out.println(res1.ejecuta());

        Operacion mult1=new Multiplicacion(3,3);
        System.out.println(mult1.ejecuta());
    }
}
