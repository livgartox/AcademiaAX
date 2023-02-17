package com.Calculadora.calculadorav2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Operacion sum1=new Suma(4,5);
        Operacion res1=new Resta(5,9);
        Operacion mult1=new Multiplicacion(3,3);

        List<Operacion> listaOperaciones=new ArrayList<>();

        listaOperaciones.add(sum1);
        listaOperaciones.add(res1);
        listaOperaciones.add(mult1);

        for (Operacion o:listaOperaciones) {
            System.out.println(o);
            System.out.println(o.ejecuta());
        }


    }
}
