package com.tarea1;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        CaraDado cara;
        while(CaraDado.jugar==true && CaraDado.dInicial>=100){
            cara=CayoDado();
            cara.DineroGanado();
            CaraDado.seguirJugando();
        }

    }

    public static CaraDado CayoDado(){
        int random=new Random().nextInt(6)+1;
        System.out.println(random);
        if(random%2==0){
            return new Pares();
        }else{
            return new Impares();
        }
    }
}
