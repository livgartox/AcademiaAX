package InyeccionDependencias.vfinal.v3;

public class Basico implements Plan {


    public void logInCuenta(){
        System.out.println("Ha iniciado "+this.getClass().getSimpleName());
    }

}
