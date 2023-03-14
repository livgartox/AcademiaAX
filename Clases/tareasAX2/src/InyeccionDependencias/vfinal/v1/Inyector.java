package InyeccionDependencias.vfinal.v1;

public class Inyector {
    static void InyectarPlan(Usuario usuario){
        usuario.planUser=new BasicoAnuncios();
    }
}
