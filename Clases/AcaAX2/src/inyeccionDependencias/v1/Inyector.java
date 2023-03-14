package inyeccionDependencias.v1;

public class Inyector {
    static Computadora cw=new CompuWindows("Vista");
    static Computadora cl=new CompuLinux("Ubuntu 18");

    static void inyectarWin(Becario b){
        b.computadora=cw;
    }

    static void inyectarLin(Becario b){
        b.computadora=cl;
    }
    static void inyectarMac(Becario b){
        b.computadora=cl;
    }
}
