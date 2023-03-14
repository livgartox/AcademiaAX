package InyeccionDependencias.vfinal.v4;

public class Premium implements Plan {

    public void logInCuenta(){
        System.out.println("Ha iniciado "+this.getClass().getSimpleName());
    }

    @Override
    public void descargandoPelicula() {
        System.out.println("Descargando");
    }

    public void aumentandoVelocidad(){
        //System.out.println("Elija velocidad");
        //System.out.println("1 - X1.25");
        //System.out.println("2 - X1.5");
        //System.out.println("3 - x2");
        System.out.println("AumentandoVelocidad");
    }

}
