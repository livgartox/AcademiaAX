package com.Calculadora.calculadorav7;

public class DIvision extends OperacionAbstracta {
    DIvision(int x, int y){
        super(x,y);
    }

    @Override
    public int ejecuta(){
        return x+y;
    }

}