package com.tarea1;

import java.util.Scanner;

public class CaraDado {
    static int dInicial=100;
    static boolean jugar=true;
    public void DineroGanado(){
        System.out.println("Usted ganó 0 pesos");
    }

    public static boolean seguirJugando(){
        System.out.println("¿Quiere seguir jugando?");
        Scanner sc=new Scanner(System.in);
        jugar=sc.nextBoolean();
        return jugar;
    }
}
