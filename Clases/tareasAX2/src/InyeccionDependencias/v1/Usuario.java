package InyeccionDependencias.v1;

public class Usuario {
    String nombre;
    BásicoAnuncios planUser;

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void PlanUsuario(){
        System.out.println(nombre);
        planUser=new BásicoAnuncios();
    }
}
