package inyeccionDependencias.v5;

public class Inyector {
    static Computadora cw=new CompuWindows("Vista");
    static Computadora cl=new CompuLinux("Ubuntu 18");

    static Computadora cm=new CompuLinux("MACOS1");
    static Becario getBecario(String nombre, TipoCompu tipoComp) {
        //VARIABLES LOCALES NO SE IN ICIALIZAN
        Becario b;
        switch (tipoComp) {
            case Windows:
                b = new Becario(nombre, cw);
                break;
            case Linux:
                b = new Becario(nombre, cl);
                break;
            default:
                b = new Becario(nombre, cm);
        }
        return b;
    }

    static void inyectarWin(Becario b){
        b.setComputadora(cw);
    }

    static void inyectaraLin(Becario b){
        b.setComputadora(cl);
    }

    static void inyectaraWin(Becario b){
        b.setComputadora(cm);
    }

}
