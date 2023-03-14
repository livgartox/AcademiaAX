package InyeccionDependencias.v1;

public class Básico implements Plan {
    double precio=150;
    String calidad="Buena";
    boolean descargar=true;

    @Override
    public void downloadMovies(){
        System.out.println("Descargando");
    }

    @Override
    public void cambiarPlan(){
        PlanActual();
        System.out.println("Este es el plan más alto");
    }
}
