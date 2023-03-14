package Excepciones.com.v4;

public class Principal {
    public static void main(String[] args) throws CeroException {
        int x=10000;
        int y=2;

        int resultado=0;
        try {
           resultado = calculaDiv(x, y);
        }catch (CeroException | NegativoException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Pasó por el finally");
        }
        System.out.println(resultado);
        System.out.println("Fin del programa");
    }

    private static int calculaDiv(int x, int y)
            throws CeroException, NegativoException {
        if(y==0)
            throw new CeroException("No se puede dividir entre cero");
        if(y<0)
            throw new NegativoException("No se puede dividir entre negativos");
        if(x>1000)
            throw new UnsupportedOperationException("X no puede ser mayor a 1000");
        return x/y;
    }
}
