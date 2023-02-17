package com.tarea1;

public class Pares extends CaraDado{
    @Override
    public void DineroGanado(){
        dInicial=dInicial+100;
        System.out.println("Usted ganó 100 pesos");
        System.out.println("Tiene "+dInicial);
    }

}
