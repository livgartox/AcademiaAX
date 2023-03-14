package Excepciones.com.v6;

public class Principal {
    public static void main(String[] args) throws Exception {
        try(Pato pato=new Pato()){
            pato.volar();
        }
        System.out.println("Fin del programa");
    }
}
