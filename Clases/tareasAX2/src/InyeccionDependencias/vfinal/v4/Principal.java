package InyeccionDependencias.vfinal.v4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Ingrese su nombre");
        Scanner sc=new Scanner(System.in);
        String nombre=sc.next();
        System.out.println("Ingrese el plan");
        Plan.opciones();
        int plan=sc.nextInt();

        Usuario u1= Inyector.getBecario(nombre,plan);
        u1.logginaMiCuenta();

        //Para cambiar de plan
        //Plan.opciones();
        //int cp=sc.nextInt();
        //Inyector.cambiarPlan(u1,cp);
        //u1.logginaMiCuenta();

        //descargar peli
        //u1.descargarPeli();

        //aumentar velocidad
        u1.aumentarVelocidad();
    }

}
