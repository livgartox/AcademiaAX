package Excepciones.com.v3;

public class Principal {
    public static void main(String[] args) throws CeroException {
        int x=10;
        int y=0;

        int resultado=0;
           resultado = calculaDiv(x, y);
        resultado = calculaDiv(x, y);
        System.out.println(resultado);
        System.out.println("Fin del programa");
    }

    private static int calculaDiv(int x, int y) throws CeroException {
        if(y==0){
            throw new CeroException("No se puede dividir entre cero");
        }
        return x/y;
    }
}
