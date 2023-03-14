package InyeccionDependencias.vfinal.v3;

public class Principal {
    public static void main(String[] args) {
        Usuario u1=Inyector.getBecario();
        u1.logginaMiCuenta();
    }

}
