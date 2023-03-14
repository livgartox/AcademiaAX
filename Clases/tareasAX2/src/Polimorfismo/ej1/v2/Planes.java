package Polimorfismo.ej1.v2;
//Suponiendo que ya está suscrita
public interface Planes {

    void downloadMovies();

    default void PlanActual(){
        System.out.println("Actualmente se encuentra en el plan "+this.getClass().getSimpleName());
    }

    void cambiarPlan();

    //ver pelicula
    //quitar anuncios

}
