package Polimorfismo.ej1.v1;
//Suponiendo que ya está suscrita
public abstract class Planes {
    double precio;
    String calidad;
    boolean descargar;

    public abstract void downloadMovies();

    public void PlanActual(){
        System.out.println("Actualmente se encuentra en el plan "+this.getClass().getSimpleName());
    }

    public abstract void cambiarPlan();

    //ver pelicula
    //quitar anuncios

}
