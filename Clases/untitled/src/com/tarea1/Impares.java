package com.tarea1;

public class Impares extends CaraDado{
    @Override
    public void DineroGanado(){
        dInicial=dInicial-100;

        System.out.println("Perdío 100");
        System.out.println("Tiene "+dInicial);
    }
}
