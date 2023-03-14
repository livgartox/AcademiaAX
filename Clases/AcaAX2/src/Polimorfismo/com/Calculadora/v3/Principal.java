package Polimorfismo.com.Calculadora.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        List<Operacion> listaOpe=new ArrayList<>();


        listaOpe.add(new Suma(9,8));
        listaOpe.add(new Resta(5,3));
        listaOpe.add(new Multi(8,9));
        listaOpe.add(new Potencia(3,3));

        showResults(listaOpe);

    }

    private static void showResults(List<Operacion> listaOpe) {
        for (Operacion op:listaOpe) {
            if(op instanceof Multi){
                System.out.println("Multiplicación"+
                        "{x=" + op.getX() +
                                ", y=" + op.getY() +
                                '}');
            }else{
                System.out.println(op.toString());
            }
            System.out.println(op.ejecuta());
        }

    }
}
