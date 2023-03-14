package Excepciones.com.v2;

public class Principal {
    public static void main(String[] args) throws CeroException {
        int x=10;
        int y=0;

        int resultado=0;
        try {
           resultado = calculaDiv(x, y);
        }finally{
            System.out.println("Pasó por el finally");
        }
        resultado = calculaDiv(x, y);
        System.out.println(resultado);
    }

    private static int calculaDiv(int x, int y) throws CeroException{
        if(y==0){
            throw new CeroException("No se puede dividir entre cero");
        }
        return x/y;
    }
}
