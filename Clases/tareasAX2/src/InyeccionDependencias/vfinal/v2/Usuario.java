package InyeccionDependencias.vfinal.v2;


public class Usuario {
    private String nombre;
    private Plan planUser;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    void logginaMiCuenta(){
        System.out.println(nombre);
        planUser.logInCuenta();
    }

    public Plan getPlanUser() {
        return planUser;
    }

    public void setPlanUser(Plan planUser) {
        this.planUser = planUser;
    }
}
