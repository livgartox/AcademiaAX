package Polimorfismo.com.Calculadora.v1;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Suma ope1=new Suma(3,4);
        Resta ope2=new Resta(5,3);
        Resta ope3=new Resta(8,9);

        List<Operacion> listaOpe=new ArrayList<>();
        listaOpe.add(ope1);
        listaOpe.add(ope2);
        listaOpe.add(ope3);

        showResults(listaOpe);

    }

    private static void showResults(List<Operacion> listaOpe) {
        for (Operacion op:listaOpe) {
            System.out.println(op.toString());
            System.out.println(op.ejecuta());
        }
    }
}
