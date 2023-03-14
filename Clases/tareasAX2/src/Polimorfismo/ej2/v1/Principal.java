package Polimorfismo.ej2.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        //Asignacion de elemento

        List<Elemento> listaElem=new ArrayList<>();
        listaElem.add(new Agua());
        listaElem.add(new Fuego());
        listaElem.add(new Tierra());
        listaElem.add(new Aire());


        listaElem.get(GetElement(listaElem)).Jutsu();
    }

    public static int GetElement(List<Elemento> listaElem){
        Random rand = new Random();
        int aleatorio = rand.nextInt(listaElem.size());
        listaElem.indexOf(aleatorio);
        return aleatorio;
    }
}
