package com.Calculadora.calculadorav6;

public class DIvision implements Operacion {
    int x;
    int y;
    DIvision(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public int ejecuta(){
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
