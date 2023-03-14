package Polimorfismo.com.Calculadora.v2;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {

        List<Operacion> listaOpe=new ArrayList<>();
        listaOpe.add(new Suma(3,4));
        listaOpe.add(new Resta(5,3));
        listaOpe.add(new Multi(8,9));
        listaOpe.add(new Potencia(3,3));

        showResults(listaOpe);

    }

    private static void showResults(List<Operacion> listaOpe) {
        for (Operacion op:listaOpe) {
            System.out.println(op.toString());
            System.out.println(op.ejecuta());
        }
    }
}
