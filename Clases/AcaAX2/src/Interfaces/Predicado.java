package Interfaces;

public interface Predicado {
    //definir variables no es recomendable por que son constantes
    int x=5;
    String cadena="Hola";
    StringBuilder sb=new StringBuilder();

    //abstract
    boolean probar(String s);

    //VERSION 8
    //MÉTODOS CON COMPORTAMIENTO

    static void and(){
        System.out.println("and");
    }

    //ocupa una instancia
    default void or(){
        System.out.println("or");
    }

    //VERSION 9
    //Métodos privados con comportamiento
    private void otroAnd(){
        System.out.println("otro and");
    }

    private static void otroOr(){
        System.out.println("otro or");
    }
}
