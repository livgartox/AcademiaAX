package Excepciones.com.v1;

public class Principal {
    public static void main(String[] args) {
        int x=10;
        int y=0;

        int resultado=0;
        try {
            resultado = calculaDiv(x, y);
        }catch (ArithmeticException e){
            System.out.println("Atrapó la exception ArithmeticException ");
        }finally{
            System.out.println("Pasó por el finally");
        }
        System.out.println(resultado);
    }

    private static int calculaDiv(int x, int y) {
        return x/y;
    }
}
