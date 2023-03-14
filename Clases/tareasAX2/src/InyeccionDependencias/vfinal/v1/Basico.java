package InyeccionDependencias.vfinal.v1;

public class Basico implements Plan{


    public void logInCuenta(){
        System.out.println("Ha iniciado "+this.getClass().getSimpleName());
    }

}
