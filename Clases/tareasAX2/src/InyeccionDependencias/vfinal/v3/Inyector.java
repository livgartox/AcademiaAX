package InyeccionDependencias.vfinal.v3;

public class Inyector {
    static Usuario getBecario(){
        Plan basico=new Basico();
        Plan bAnuncios=new BasicoAnuncios();
        return new Usuario("Adriana",basico);
    }
}
