package Polimorfismo.com.Calculadora.v1;

public class Resta extends Operacion{

    public Resta(int x, int y) {
        super(x,y);
    }

    int ejecuta(){
        return x-y;
    }

}
