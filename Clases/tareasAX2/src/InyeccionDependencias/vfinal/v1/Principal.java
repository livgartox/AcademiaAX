package InyeccionDependencias.vfinal.v1;

public class Principal {
    public static void main(String[] args) {
        Usuario u1=new Usuario("Adriana");
        Inyector.InyectarPlan(u1);
        u1.logginaMiCuenta();
    }

}
