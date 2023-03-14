package Polimorfismo.com.Calculadora.v4;

public class Potencia implements Operacion {
    int x;
    int y;

    public Potencia(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int ejecuta(){
        return (int)Math.pow(x,y);
    }

}
