package com.Animales.Animalesv2;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Animal animaleleg=getAnimal();
        animaleleg.animalSound();
    }

    public static Animal getAnimal(){
        Animal[] listAnimales=new Animal[3];
        listAnimales[0]=new Animal();
        listAnimales[1]=new Borrego();
        listAnimales[2]=new Pig();

        int random=new Random().nextInt(listAnimales.length);
        return listAnimales[random];
    }
}
