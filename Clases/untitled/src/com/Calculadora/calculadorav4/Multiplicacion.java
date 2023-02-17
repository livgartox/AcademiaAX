package com.Calculadora.calculadorav4;

public class Multiplicacion extends Operacion {

    Multiplicacion(int x, int y){
        super(x,y);
    }

    @Override
    int ejecuta(){
        return x*y;
    }

    @Override
    public String toString() {
        return "Multiplicacion{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}