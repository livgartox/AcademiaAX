package Polimorfismo.com.Calculadora.v4;

public class Suma implements Operacion {
    int x;
    int y;

    public Suma(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int ejecuta(){
        return x+y;
    }

}
