package InyeccionDependencias.vfinal.v1;


public class Usuario {
    private String nombre;
    Plan planUser;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    void logginaMiCuenta(){
        System.out.println(nombre);
        planUser.logInCuenta();
    }

}
