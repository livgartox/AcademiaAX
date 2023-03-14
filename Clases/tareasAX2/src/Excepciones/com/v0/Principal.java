package Excepciones.com.v0;

public class Principal {
    public static void main(String[] args) {
        int x=10;
        int y=0;

        int resultado=0;
        try {
            resultado = calculaDiv(x, y);
        }catch (ArithmeticException e){
            System.out.println("Atrapó la exception ArithmeticException ");
        }
        System.out.println(resultado);
    }

    private static int calculaDiv(int x, int y) {
        return x/y;
    }
}
