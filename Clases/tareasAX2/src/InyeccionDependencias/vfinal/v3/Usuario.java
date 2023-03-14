package InyeccionDependencias.vfinal.v3;


public class Usuario {
    private String nombre;
    private Plan planUser;

    public Usuario(String nombre, Plan planUser) {
        this.nombre = nombre;
        this.planUser = planUser;
    }

    void logginaMiCuenta(){
        System.out.println(nombre);
        planUser.logInCuenta();
    }

}
