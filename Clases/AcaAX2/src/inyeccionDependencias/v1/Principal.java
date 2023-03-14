package inyeccionDependencias.v1;

public class Principal {
    public static void main(String[] args) {
        Becario bec1=new Becario("Patrobas");
        Inyector.inyectarLin(bec1);
        bec1.encenderComputadora("WINDOWS");

        Becario bec2=new Becario("Tercio");
        Inyector.inyectarWin(bec2);
        bec2.encenderComputadora("Windows");
    }
}
