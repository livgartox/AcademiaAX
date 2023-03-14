package InyeccionDependencias.v1;
//Suponiendo que ya está suscrita
public interface Plan {

    void downloadMovies();

    default void PlanActual(){
        System.out.println("Actualmente se encuentra en el plan "+this.getClass().getSimpleName());
    }

    void cambiarPlan();

    //ver pelicula
    //quitar anuncios

}
