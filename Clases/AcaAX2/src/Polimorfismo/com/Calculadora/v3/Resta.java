package Polimorfismo.com.Calculadora.v3;

public class Resta extends Operacion {

    public Resta(int x, int y) {
        super(x,y);
    }

    int ejecuta(){
        return getX()-getY();
    }

}
