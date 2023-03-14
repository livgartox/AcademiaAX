package Polimorfismo.ej1.v0;

public class Básico extends Planes{
    double precio=150;
    String calidad="Buena";
    boolean descargar=true;

    public void downloadMovies(){
        System.out.println("Descargando");
    }

    public void cambiarPlan(){
        PlanActual();
        System.out.println("Este es el plan más alto");
    }
}
