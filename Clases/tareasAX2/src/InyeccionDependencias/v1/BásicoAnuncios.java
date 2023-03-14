package InyeccionDependencias.v1;

public class BásicoAnuncios implements Plan {
    double precio=99;
    String calidad="Buena";
    boolean descargar;

    @Override
    public void downloadMovies(){
        System.out.println("Usted no puede descargar");
    }

    @Override
    public void cambiarPlan(){
        PlanActual();
        System.out.println("A QUÉ PLAN QUIERE CAMBIAR? básico");
    }
}
