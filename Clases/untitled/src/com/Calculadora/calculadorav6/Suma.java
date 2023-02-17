package com.Calculadora.calculadorav6;

public class Suma implements Operacion {
    int x;
    int y;
    Suma(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int ejecuta(){
        return x+y;
    }

    @Override
    public String toString() {
        return "Suma{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
