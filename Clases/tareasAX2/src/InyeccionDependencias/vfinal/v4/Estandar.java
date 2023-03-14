package InyeccionDependencias.vfinal.v4;

public class Estandar implements Plan {

    public void logInCuenta(){
        System.out.println("Ha iniciado "+this.getClass().getSimpleName());
    }

    @Override
    public void descargandoPelicula() {
        System.out.println("Descargando");
    }

}
