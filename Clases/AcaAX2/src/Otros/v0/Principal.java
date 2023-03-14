package Otros.v0;

public class Principal {
    public static void main(String[] args) {

        //En este caso la variable de referencia es de una clase que
        //no tiene un método, no lo va a poder ejecutar
        Ave ave=new Aguila();

        ave.volar();
        ave.volarAve();
        //DOWNCASTING: Porque bajé de nivel, de ahuila a ave
        ((Aguila)ave).volarAguila();

    }

}
