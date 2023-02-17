package com.Animales.Animales;

public class Principal {
    public static void main(String[] args) {
        Animal a1=new Animal();
        Animal a2=new Borrego();
        Animal a3=new Pig();

        a1.animalSound();
        a2.animalSound();
        a3.animalSound();
    }
}
