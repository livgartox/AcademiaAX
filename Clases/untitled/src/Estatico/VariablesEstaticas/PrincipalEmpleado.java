package Estatico.VariablesEstaticas;

import Estatico.VariablesEstaticas.Empleado;

public class PrincipalEmpleado {
    public static void main(String[] args) {
        Empleado e1=new Empleado("Patrobas");
        //Como son staticos, deben pertenecer a la clase
        System.out.println(Empleado.contador);
        Empleado e2=new Empleado("Arquimedes");
        System.out.println(Empleado.contador);
        Empleado e3=new Empleado("Bonifacio");
        System.out.println(Empleado.contador);

        System.out.println(e1.contReal);
        System.out.println("e2.contReal = " + e2.contReal);
    }
}
