package Polimorfismo.com.Calculadora.v4;

public class Multi implements Operacion {
    int x;
    int y;

    public Multi(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int ejecuta(){
        return x*y;
    }

}
