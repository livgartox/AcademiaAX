package Polimorfismo.ej1.v0;

public class BásicoAnuncios extends Planes{
    double precio=99;
    String calidad="Buena";
    boolean descargar;

    public void downloadMovies(){
        System.out.println("Usted no puede descargar");
    }

    public void cambiarPlan(){
        PlanActual();
        System.out.println("A QUÉ PLAN QUIERE CAMBIAR?");
    }
}
