package com.Calculadora.calculadorav6;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Operacion> listaOperaciones=new ArrayList<>();

        listaOperaciones.add(new Suma(4,5));
        listaOperaciones.add(new Resta(5,9));
        listaOperaciones.add(new Multiplicacion(3,3));
        listaOperaciones.add(new DIvision(4,4));

        for (Operacion o:listaOperaciones) {
            System.out.println(o);
            System.out.println(o.ejecuta());
        }

        
    }
}
