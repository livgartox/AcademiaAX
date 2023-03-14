package InyeccionDependencias.vfinal.v2;

public class Inyector {
    static void InyectarPlan(Usuario usuario){
        usuario.setPlanUser(new BasicoAnuncios());;
    }
}
