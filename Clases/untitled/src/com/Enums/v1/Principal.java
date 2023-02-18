package com.Enums.v1;

public class Principal {


    public static void main(String[] args) {
        Estaciones e=getEstacion();
        switch (e){
            case PRIMAVERA:
                System.out.println("Muchos visitantes");
                break;
            case VERANO:
                System.out.println("Maso visitantes");
                break;
            case OTONO:
                System.out.println("Pocos visitantes");
                break;
            case INVIERNO:
                System.out.println("Nada de visitantes, mucho frío");
                break;
            default:
                System.out.println("No lo comprendimos");
        }

        String[] arrayEstaciones=new String[4];
        for (Estaciones estacion:Estaciones.values()) {
            System.out.println("Hola, estamos en "+estacion.name());
            System.out.println(estacion.ordinal());

            arrayEstaciones[estacion.ordinal()]=estacion.name();
        }
        System.out.println("ARRAY FINAL "+arrayEstaciones.toString());



    }
    private static Estaciones getEstacion(){
        return Estaciones.INVIERNO;
    }
}
