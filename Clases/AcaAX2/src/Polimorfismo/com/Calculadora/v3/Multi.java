package Polimorfismo.com.Calculadora.v3;

public class Multi extends Operacion {
    public Multi(int x, int y) {
        super(x,y);
    }

    @Override
    int ejecuta(){
        return getX()*getX();
    }

}
