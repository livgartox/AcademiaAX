package Polimorfismo.com.Calculadora.v0;

public class Resta {
    int x;
    int y;

    public Resta(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int ejecuta(){
        return x-y;
    }

    @Override
    public String toString() {
        return "Resta{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
