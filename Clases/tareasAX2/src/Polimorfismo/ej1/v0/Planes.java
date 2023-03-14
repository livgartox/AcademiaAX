package Polimorfismo.ej1.v0;
//Suponiendo que ya está suscrita
public class Planes {
    double precio;
    String calidad;
    boolean descargar;

    public void downloadMovies(){
        System.out.println("¿Se podrá descargar?");
    }

    public void PlanActual(){
        System.out.println("Actualmente se encuentra en el plan "+this.getClass().getSimpleName());
    }

    public void cambiarPlan(){
        System.out.println("cambiarPlanAbstracto");
    }

    //ver pelicula
    //quitar anuncios

}
