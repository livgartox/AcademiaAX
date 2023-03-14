package InyeccionDependencias.vfinal.v2;

public class BasicoAnuncios implements Plan {

    public void logInCuenta(){
        System.out.println("Ha iniciado "+this.getClass().getSimpleName());
    }

}
