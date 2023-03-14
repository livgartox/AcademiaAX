package InyeccionDependencias.v0;

public class BásicoAnuncios {
    double precio=99;
    String calidad="Buena";
    boolean descargar;

    public void downloadMovies(){
        System.out.println("Usted no puede descargar");
    }

    public void cambiarPlan(){
        System.out.println("Usted tiene el plan "+this.getClass().getSimpleName());
        System.out.println("A QUÉ PLAN QUIERE CAMBIAR? básico");
    }
}
