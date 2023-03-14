package InyeccionDependencias.vfinal.v4;

public interface Plan {
    public void logInCuenta();

    public void descargandoPelicula();
    static void opciones(){
        System.out.println("1.- Plan Básico con Anuncios");
        System.out.println("2.- Plan Básico");
        System.out.println("3.- Plan Estandar");
        System.out.println("4.- Plan Premium");
    }
}
