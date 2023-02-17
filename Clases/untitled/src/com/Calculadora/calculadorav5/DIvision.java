package com.Calculadora.calculadorav5;

public class DIvision extends Operacion {

    DIvision(int x, int y){
        super(x,y);
    }

    @Override
    int ejecuta(){
        return x/y;
    }

    @Override
    public String toString() {
        return "Division{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
