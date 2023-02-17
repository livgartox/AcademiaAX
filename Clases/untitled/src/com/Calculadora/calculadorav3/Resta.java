package com.Calculadora.calculadorav3;

public class Resta extends Operacion {

    Resta(int x, int y){
        super(x,y);
    }
    @Override
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