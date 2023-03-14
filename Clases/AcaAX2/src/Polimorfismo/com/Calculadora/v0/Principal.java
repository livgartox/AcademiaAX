package Polimorfismo.com.Calculadora.v0;

public class Principal {
    public static void main(String[] args) {
        Suma ope1=new Suma(3,4);
        Resta ope2=new Resta(5,3);

        System.out.println(ope1.toString());
        System.out.println(ope1.ejecuta());
        System.out.println(ope2.toString());
        System.out.println(ope2.ejecuta());
    }
}
