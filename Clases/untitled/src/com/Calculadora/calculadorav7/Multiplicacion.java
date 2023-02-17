package com.Calculadora.calculadorav7;

public class Multiplicacion extends OperacionAbstracta {
    Multiplicacion(int x, int y){
        super(x,y);
    }

    @Override
    public int ejecuta(){
        return x+y;
    }

}