package Polimorfismo.com.curso.v0;

import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.getSound();

        animal=new Perro();
        animal.getSound();

        animal=new Gato();
        animal.getSound();

        animal=new Pato();
        animal.getSound();

        animal=getAnimal();
        System.out.println("Aleatorio");
        animal.getSound();
    }

    private static Animal getAnimal() {
        Animal[] animals={new Gato(),new Pato(),new Perro(),new Oso()};
        int entero=new Random().nextInt(animals.length);
        return animals[entero];
    }
}
