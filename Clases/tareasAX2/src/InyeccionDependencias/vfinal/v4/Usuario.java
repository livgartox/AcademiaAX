package InyeccionDependencias.vfinal.v4;


public class Usuario {

    private String nombre;
    private Plan planUser;


    public Usuario(String nombre, Plan planUser) {
        this.nombre = nombre;
        this.planUser = planUser;
    }


    void logginaMiCuenta() {
        System.out.println(nombre);
        planUser.logInCuenta();
    }

    public Plan getPlanUser() {
        return planUser;
    }

    public void setPlanUser(Plan planUser) {
        this.planUser = planUser;
    }

    void descargarPeli() {
        planUser.descargandoPelicula();
    }

    void aumentarVelocidad() {
        if (planUser instanceof Premium) {
            ((Premium) planUser).aumentandoVelocidad();
        }else{
            System.out.println("Sorry, no puedo");
        }

    }
}
