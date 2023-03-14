package Polimorfismo.com.Calculadora.v3;

public class Suma extends Operacion {
    public Suma(int x, int y) {
        super(x,y);
    }

    @Override
    int ejecuta(){
        return getX()+getY();
    }

}
