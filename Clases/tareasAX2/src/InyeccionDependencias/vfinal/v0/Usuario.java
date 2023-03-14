package InyeccionDependencias.vfinal.v0;


public class Usuario {
    private String nombre;
    Basico planUser;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    void logginaMiCuenta(){
        System.out.println(nombre);
        planUser=new Basico();
        planUser.logInCuenta();
    }

}
