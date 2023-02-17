package com.Calculadora.calculadorav5;

public abstract class Operacion {
    int x;
    int y;

    Operacion(int x, int y){
        this.x=x;
        this.y=y;
    }

    abstract int ejecuta();
}
