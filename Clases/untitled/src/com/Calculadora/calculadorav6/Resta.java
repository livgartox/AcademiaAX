package com.Calculadora.calculadorav6;

public class Resta implements Operacion {
    int x;
    int y;
    Resta(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int ejecuta(){
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