package com.Animales.Animalesv3;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Animal animaleleg=getAnimal();
        animaleleg.animalSound();
    }

    public static Animal getAnimal(){
        Animal[] listAnimales=new Animal[3];
        listAnimales[0]=new Borrego();
        listAnimales[1]=new Pig();
        listAnimales[2]=new Gato();


        int random=new Random().nextInt(listAnimales.length);
        return listAnimales[random];
    }
}
