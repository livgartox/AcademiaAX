package inyeccionDependencias.v4;

public class Principal {
    public static void main(String[] args) {
        Becario b1= Inyector.getBecario("Patrobas","Windows");
        b1.encenderComputadora();

        Becario b2= Inyector.getBecario("Adriana","Linux");
        b2.encenderComputadora();

        //si en el futuro queremos cambiarle
        Inyector.inyectaraLin(b1);
        b1.encenderComputadora();
    }
}
