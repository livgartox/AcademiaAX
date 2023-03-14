package InyeccionDependencias.v0;

public class Básico{
    double precio=150;
    String calidad="Buena";
    boolean descargar=true;

    public void downloadMovies(){
        System.out.println("Descargando");
    }

    public void cambiarPlan(){
        System.out.println("Usted tiene el plan "+this.getClass().getSimpleName());
        System.out.println("Este es el plan más alto");
    }
}
